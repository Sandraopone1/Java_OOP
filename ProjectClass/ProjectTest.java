class ProjectTest {
    public static void main(String[] args) {
    	// Greeter hW = new Greeter();
     //    String greeting = hW.greet();


    	Project person1 = new Project();
    	Project person2 = new Project("Ama");
    	Project person3 = new Project("Christy", "She is blessed");
    	Project person4 = new Project();
    	String info = person4.elevatorPitch("Jennifer", "Jesus Rocks");
    	


    	person1.setName("Sandra");
    	person1.setDescription("Fearfully and wonderfully made by GOD");
    	String newName1 = person1.getName();
    	String newDescription1 = person1.getDescription();


    	String newName2 = person2.getName();

    	String newName3 = person3.getName();
    	String newName4 = person3.getDescription();
    	

    	System.out.println(newName1 + " " + newDescription1);
    	System.out.println(newName2);
    	System.out.println(newName3);
    	System.out.println(newName4);
    	System.out.println(info);




        // Project elevatorPitch = new Project();
        // String color = elevatorPitch.getColor();
        // System.out.println("The Vehicle color is: " + color);
    }
}