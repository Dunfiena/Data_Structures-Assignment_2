public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        linkList<Object> objectlinkList = new linkList<Object>();
        linkList<Object> objectlinkList2 = new linkList<Object>();

        System.out.println("\n-----{ Insert last test/ populating for further tests }-----");
        objectlinkList.insert_last(1);
        objectlinkList.insert_last(2);
        objectlinkList.insert_last(2);
        objectlinkList.insert_last(6);
        objectlinkList.insert_last(3);
        objectlinkList.insert_last(8);
        objectlinkList.insert_last(2);

        objectlinkList.show();
        System.out.println(objectlinkList.size());
        System.out.println("\n-----{ Insert first test }-----");
        System.out.println("-----{ Outcome shows 3 and 9 added to beginning of array}-----");

        objectlinkList.insert_first(9);
        objectlinkList.insert_first(3);
        objectlinkList.show();


        System.out.println("\n-----{ Insert at index test }-----");
        System.out.println("-----{ Outcome shows Error handling, 12 added to beginning of array and 9 to index 3 }-----");

        objectlinkList.insert_index(10,12);
        objectlinkList.insert_index(0,12);
        objectlinkList.insert_index(3, 7);
        objectlinkList.show();

        System.out.println("\n-----{ Delete last test }-----");
        System.out.println("-----{ Outcome shows 8 and 2 are removed from array }-----");
        objectlinkList.delete_last();
        objectlinkList.delete_last();
        objectlinkList.show();

        System.out.println("\n-----{ Delete first test }-----");
        System.out.println("-----{ Outcome shows 12 and 3 are removed from array }-----");

        objectlinkList.delete_first();
        objectlinkList.delete_first();
        objectlinkList.show();

        System.out.println("\n-----{ Delete at index test }-----");
        System.out.println("-----{ Outcome shows Error handling, 9 in deleted from beginning of array and 2 is removed from index 2 }-----");

        objectlinkList.delete_index(12);
        objectlinkList.delete_index(0);
        objectlinkList.delete_index(2);
        objectlinkList.show();

        System.out.println("\n-----{ Split test }-----");
        objectlinkList.insert_last(1);
        objectlinkList.insert_last(2);
        objectlinkList.insert_last(2);
        objectlinkList.insert_last(6);
        objectlinkList.insert_last(3);
        objectlinkList.insert_last(8);

        linkList[] split = objectlinkList.split_list();
        objectlinkList = split[0];
        objectlinkList2 = split[1];

        System.out.println("\n- [ linkList 1 ] -");
        objectlinkList.show();
        System.out.println("\n- [ linkList 2 ] -");
        objectlinkList2.show();

        System.out.println("\n-----{ Merge Sort Test }-----");

        objectlinkList = objectlinkList.merge_sort(objectlinkList,objectlinkList2);
        objectlinkList.show();
    }
}