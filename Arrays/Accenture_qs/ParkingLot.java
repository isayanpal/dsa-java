package Arrays.Accenture_qs;

//The function accepts a character array ‘arr’ of size ‘n’ as its argument.
//Each element of ‘arr’ represents the status of a parking slot, where ‘S’
//represents an empty slot and ‘X’ represents an occupied slot.
//The function needs to return the maximum number of cars that can be parked
// in the parking lot. It is assumed that two cars cannot occupy the same
// slot and cars can only park in consecutive empty slots.

public class ParkingLot {
    public static int maxCarsParked(int n, char[] arr){
        int maxCars = 0;
        int currentCars = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'S'){
                currentCars++;
            } else {
                maxCars = Math.max(maxCars,currentCars);
                currentCars = 0;
            }
        }

        maxCars = Math.max(maxCars,currentCars);
        return  maxCars;
    }

    public static void main(String[] args) {
        int n = 16;
        char[] arr = "XXXSXXSXXSSXXSXX".toCharArray();
        int res = maxCarsParked(n,arr);
        System.out.println(res);
    }
}
