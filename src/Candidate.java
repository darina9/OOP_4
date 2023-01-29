import java.util.Scanner;

public class Candidate {

    public void addPersonaToDepartment(Persona persona, Group group){
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("В таком случае, Вы нам не подходите, всего наилучшего!");
        }
    }

    public String UpdateDepint()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("В какой отдел хотите перейти?");
        System.out.println("1 - IT\n2 - Логистика\n3 - Бухгалтерия");
        String answer1 = in.next();
        return answer1;
    }

    public void AddPersona(){
        Scanner in = new Scanner(System.in);
        System.out.println("*".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("ФИО работника: ");
        String FIO = in.nextLine();
        System.out.println("ПОЛ работника: ");
        String Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        int Age = in.nextInt();
        Persona p = new Persona(FIO, Sex, Age);
        Group depAcc1 = new Group("штат");
        addPersonaToDepartment(p, depAcc1);
        depView(depAcc1);
    }

    public void UppdateDep(){
        System.out.println("Введите Ваши данные: ");
        Scanner in = new Scanner(System.in);
        System.out.println("ФИО работника: ");
        String FIO = in.nextLine();
        System.out.println("ПОЛ работника: ");
        String Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        int Age = in.nextInt();
        Persona p = new Persona(FIO, Sex, Age);
        Group depAcc1 = new Group(UpdateDepint());
        addPersonaToDepartment(p, depAcc1);
        depView(depAcc1);

    }

    public  void depView(Group root){
        System.out.println("Название отдела" +" "+ root.deptName);
        for (var a: root.GetDep()) {
            System.out.println(a.getpFIO()+ " " + a.getpSex()+ " " + a.getpAge());
        }
    }

}
