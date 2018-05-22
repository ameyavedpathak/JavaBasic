void visitor_main(...){
int carId;
museum->wander(); // You don't need to write this
carId = ride->waitForCar(); // Returns id of car I will ride 0..n-1
park->sightsee(); // You don't need to write this
ride->getOutOfCar(carId); // Postcondition: car can get in line
}
and the main function for a car thread is
void car_main(...){
ride->waitForPassenger(myId); // Postcondition: passenger in car
ride->cruiseUntilPassengerGetsOut(myId); // Postcondition: can get in line
}
Implement the ride object using the framework below. Your solution must follow the coding stan-
dards specied in class.
List the member variables for a ride object:
Solution: Lock mutex;
Cond carReady;
Cond passengerIn;
Cond passengerOut;
const int n = NCARS;
int carState[n]; // Each entry initialized to FREE
int nextTicketToGive = 0;
int nextTicketReady = 0;
int carsWaiting = 0;
List waitingCars;
int frontCarLoaded = 0;
Name: 7
int ride::waitForCar() // Postcondition: I am at head of line; Returns id of car I will ride 0..n-1
Solution: mutex->lock();
int myTicket = nextTicketToGive++;
while(carsWaiting == 0 OR myTicket != nextTicketReady)f
carReady.wait(&mutex);
g
int myCar = waitingCars->getHead();
frontCarLoaded = true;
carState[myCar] = BUSY;
passengerIn.broadcast(&mutex);
mutex->unlock();
return myCar;
ride::getOutOfCar(int carId) // Postcondition: car can get in line
Solution: mutex->lock();
carState[carId] = FREE;
passengerOut.broadcast(&mutex);
mutex->unlock();
Name: 8
ride::waitForPassenger(int carId) // Postcondition: passenger in car
Solution: mutex->lock();
carsWaiting++;
waitingCars.add(carId);
carReady->broadcast(&mutex);
while(!frontCarLoaded && waitingCars->getHead() != carId)f
passengerIn.wait(&mutex);
g
frontCarLoaded = 0;
carsWaiting{;
waitingCars.remove(carId);
nextTicketReady++;
carReady.broadcast(&mutex);
mutex->unlock();
ride::cruiseUntilPassengerGetsOut(int carId) // Postcondition: can get in line
Solution: mutex->lock();
while(carState[carId] != FREE)f
passengerOut.wait(&mutex);
g
mutex->unlock();