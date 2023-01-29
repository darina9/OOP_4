public class Menu {
    public void start()  {
        System.out.println("Выберите действие: ");
        StringBuilder sb = new StringBuilder()
                .append("\n*************************\n")
                .append("1 - Добавить сотрудника\n")
                .append("2 - Сменить отдел\n")
                .append("3 - Текущий отдел\n")
                .append("0 - Выход\n")
                .append("\n*************************\n");
        ShowConsole ui=new ShowConsole();
        Candidate p =new Candidate();
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.AddPersona();
                    break;
                case "2":
                    p.UppdateDep();
                    break;
                case "0":
                    break;
            }
        }
    }
}