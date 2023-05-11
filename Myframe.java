import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,l7;
    JTextField t1;
    JComboBox softdrinks,meal,snacks;
    JButton btn;
    JTextArea screen;


    Myframe(){
        setTitle("Food Bill");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        l7 = new JLabel("Food Court Bill");
        l7.setBounds(220,10,500,40);
        l7.setFont(new Font("Serif", Font.BOLD, 30));
        c.add(l7);

        label1 = new JLabel("Name");
        label1.setBounds(20,50,150,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130,50,150,20);
        c.add(t1);

        label2 = new JLabel("Choose Soft Drinks");
        label2.setBounds(20,100,150,20);
        c.add(label2);

        String drinks[]={"Maza", "Coca-Cola","Mirinda","Mint-Lime","Soda-lime","Fizz","Pepsi"};
        softdrinks = new JComboBox<String>(drinks);
        softdrinks.setBounds(130,100,150,20);
        c.add(softdrinks);

        label3 = new JLabel("Choose Snacks");
        label3.setBounds(20,150,150,20);
        c.add(label3);

        String snackss[]={"Pani-puri", "Samosa","Puffs","Sev-puri","Chicken-Roll","Maggi","Buns","Parota"};
        snacks = new JComboBox<String>(snackss);
        snacks.setBounds(130,150,150,20);
        c.add(snacks);

        label4 = new JLabel("Choose Meals");
        label4.setBounds(20,200,150,20);
        c.add(label4);

        String Meals[]={"Mini-meal", "Special-meal","Kebab-rice","Biryani","Gobi","Fried-rice","Pulav","Masala-rice"};
        meal = new JComboBox<String>(Meals);
        meal.setBounds(130,200,150,20);
        c.add(meal);

        btn=new JButton("Show");
        btn.setBounds(120,250,100,40);
        c.add(btn);

        screen=new JTextArea();
        screen.setBounds(310,50,300,200);
        c.add(screen);
        getContentPane().setBackground(new Color(188,143,143));

        btn.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String name = t1.getText();
        String drink = (String)softdrinks.getSelectedItem();
        String snack = (String)snacks.getSelectedItem();
        String meals = (String)meal.getSelectedItem();

        double drinkPrice = 20.0;
        double snackPrice = 30.0;
        double mealPrice = 45.0;
        double totalBill = drinkPrice + snackPrice + mealPrice;

        screen.setText("\t  YOUR BILL"+"\n"+"--------------------------------------------------------------------------\n"+
                "Name: "+name+"\n"+"Soft Drink: "+drink+" (Price: $"+drinkPrice+")\n"+"Snacks: "+snack+" (Price: $"+snackPrice+")\n"+"Meals: "+meals+" (Price: $"+mealPrice+")\n"+
                "--------------------------------------------------------------------------\n" + "Total Bill: $" + totalBill);



    }

    public static void main(String[] args) {
        Myframe frame = new Myframe();
    }
}

