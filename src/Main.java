public class Main {
    public static void main(String[] args) {

        SimplyLinkedList simplyLinkedList = new SimplyLinkedList();
        simplyLinkedList.add(11);
        simplyLinkedList.add(22);
        simplyLinkedList.add(33);
        simplyLinkedList.add(44);

        System.out.println("razmer lista = " + simplyLinkedList.size());
        System.out.println("Add new element 60 in place 6 ");
        simplyLinkedList.add(60,6);
        System.out.println("razmer lista = " + simplyLinkedList.size());
        System.out.println("Remove First by Value 33");
        System.out.println(simplyLinkedList.removeFirstByValue(33));
        simplyLinkedList.replace(88,4);
        System.out.println("razmer lista = " + simplyLinkedList.size());



        System.out.println(simplyLinkedList);
        System.out.println(simplyLinkedList.size());

        simplyLinkedList.removeByIndex(3);
        System.out.println(simplyLinkedList);
        System.out.println("razmer lista = " + simplyLinkedList.size());


    }
}
