public class Main {
    public static void main(String[] args) {

        ClassA classA = new ClassA();
        classA.setValue(-100, 100);
        System.out.println(classA);
        System.out.println(classA.getLessThanIndex());
        System.out.println(classA.multiplyMoreThanIndex());

        FamilyBudget familyBudget = new FamilyBudget(1000);
        FamilyMember familyMember = new FamilyMember("Shako", "Kotolashvili", 20, "Average");
        familyMember.getMoney(familyBudget, 400);
    }
}