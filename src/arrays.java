public class arrays {
    public static void main(String[] args) {
        //declaration of array--
        // --> datatype [] referenceVariable = new datatype[size];
        //or we can directly do-
        // --> datatype[] referenceVariable = {entries}
        int [] rollNo;  //declaration of array, rollNo is getting defined in stack
        rollNo = new int[5]; //actually here object is being created in memory(heap)
        System.out.print(rollNo[1]); //default value of any index of int is zero
    }
}
