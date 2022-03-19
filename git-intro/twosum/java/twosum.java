/*
    To run the code, you must have a rust installed
    Go to: https://java.com/en/download/help/download_options.html#windows
    
    Once installed, open your terminal and type:
        `rustc twosum.rs`
        `./twosum` - Linux or macOS
        `.\twosum.exe` - Windows

    ** Make sure you are in the rust folder so that the
    ** code file can be found.
*/


public static void main(String[] args) {
    // Target number to compute
    int target = 8;

    // The array of values that can be used
    // Remember, arrays are 0 indexed
    int[] data = new int{ 7, 2, -3, 48, 5, 6, 46, 8, 19, -10,
        11, 32, 6, 26, 15, -16, 20, 18, 30, 20,
        21, 52, -23, 54, 21, 26, 27, 70, -29, 30}

    twosum(data,target);
}

public static void twosum(int[] data, int target){
    int complement;
    HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
    boolean Sol=false;
    for(int i=0;i<data.length;i++){
        complement = target - data[i];
        if(hMap.containKey(complement)){
            System.out.println("Value at index "+i+ "is "+data[i]);
            System.out.println("Value at index "+hMap.get(complement)+ "is "+complement);
            Sol = true;
        }
    }
    if(!sol)
    System.out.println("No Solution");

}
            