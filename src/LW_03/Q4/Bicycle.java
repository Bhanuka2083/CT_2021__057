package LW_03.Q4;

class Bicycle {

    Owner name;
    Owner phoneNum;

    Owner owner;

    public Bicycle(String name,String phoneNum) {
        owner.setOwnerName(name);
        owner.setPhoneNo(phoneNum);

    }

    public static void main(String[] args) {

        String name = "Kasun";
        String num = "+94771234567";

        Owner owner1 = new Owner(name, num);
        Bicycle bicycle1;

        System.out.println("Owner name is "+owner1.getOwnerName());
        System.out.println("Owner's phone number is "+owner1.getPhoneNo());

    }

}
