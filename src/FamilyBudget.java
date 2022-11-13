import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {

    private double money;


    public FamilyBudget(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money){
        this.money = money;
        WriteInFile();
    }

    private String getStatus() {
        String status = " ";
        if (money > 40000) {
            status = "Rich";
        }
        if (10000 > money & money < 40000){
            status = "Average";
        }
        else status = "Poor";
        return status;
    }

    private void WriteInFile() {
        File file = new File("budget.txt");
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(getStatus());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
