
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;

public class CoffeeAndBurgerPontManagementSystem extends javax.swing.JFrame {

    private java.sql.Connection con;
    private Statement st;
    private ResultSet rs;
    
    String burgerName1;
    String burgerName2;
    String burgerName3;
    String burgerName4;
    String burgerName5;
    String burgerName6;
    String burgerName7;
    String burgerName8;
    String burgerName9;
    
     
    String drinksName1;
    String drinksName2;
    String drinksName3;
    String drinksName4;
    String drinksName5;
    
     
    String coffeeName1;
    String coffeeName2;
    String coffeeName3;
    String coffeeName4;
    String coffeeName5;
    String coffeeName6;
    
     
    String date;
    
    int amountOfBurger = 0;
    int amountOfDrinks = 0;
    int amountOfCoffee = 0;
    
    String viewamountOfBurger;
    String viewamountOfDrinks;
    String viewamountOfCoffee;
    

    
    int numberofBurger1 = 0;
    int numberofBurger2 = 0;
    int numberofBurger3 = 0;
    int numberofBurger4 = 0;
    int numberofBurger5 = 0;
    int numberofBurger6 = 0;
    int numberofBurger7 = 0;
    int numberofBurger8 = 0;
    int numberofBurger9 = 0;
    
     
    int numberofDrinks1 = 0;
    int numberofDrinks2 = 0;
    int numberofDrinks3 = 0;
    int numberofDrinks4 = 0;
    int numberofDrinks5 = 0;
    
     
    int numberofCoffee1 = 0;
    int numberofCoffee2 = 0;
    int numberofCoffee3 = 0;
    int numberofCoffee4 = 0;
    int numberofCoffee5 = 0;
    int numberofCoffee6 = 0;
    
    
     
    int priceofBurger1 = 0;
    int priceofBurger2 = 0;
    int priceofBurger3 = 0;
    int priceofBurger4 = 0;
    int priceofBurger5 = 0;
    int priceofBurger6 = 0;
    int priceofBurger7 = 0;
    int priceofBurger8 = 0;
    int priceofBurger9 = 0;
    
     
    int priceOfDrinks1 = 0;
    int priceOfDrinks2 = 0;
    int priceOfDrinks3 = 0;
    int priceOfDrinks4 = 0;
    int priceOfDrinks5 = 0;
    
    
    int priceOfCoffee1 = 0;
    int priceOfCoffee2 = 0;
    int priceOfCoffee3 = 0;
    int priceOfCoffee4 = 0;
    int priceOfCoffee5 = 0;
    int priceOfCoffee6 = 0;
    
    
     
    int billofBurger1 = 0;
    int billofBurger2 = 0;
    int billofBurger3 = 0;
    int billofBurger4 = 0;
    int billofBurger5 = 0;
    int billofBurger6 = 0;
    int billofBurger7 = 0;
    int billofBurger8 = 0;
    int billofBurger9 = 0;
    
    
     
     int billofDrinks1 = 0;
     int billofDrinks2 = 0;
     int billofDrinks3 = 0;
     int billofDrinks4 = 0;
     int billofDrinks5 = 0;
     
      
     int billofCoffee1 = 0;
     int billofCoffee2 = 0;
     int billofCoffee3 = 0;
     int billofCoffee4 = 0;
     int billofCoffee5 = 0;
     int billofCoffee6 = 0;
    
    
    
    
      
    double totalCost = 0;
    double costOfBurger = 0;
    double costofDrinks = 0;
    double costofCoffee = 0;
    double subCost = 0;
    double totaltax = 0;
    int rateoftax = 0;
    double paymentamount = 0;
    double paymentreturn = 0;
    
    
        String billText;
        
        String line1;
        String billTaxRate;
        String billBurger;
        String billDrinks;
        String billCoffee;
        String billSubTotal;
        String billTax;
        String billTotalCost;
        String billPayment;
        String billReturn;
        String billDateClock;
        String billline2;
        String line;
        String line3, line4;
        
        
   
    
  
    
    public CoffeeAndBurgerPontManagementSystem() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBill = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButtonReceipt = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonTotal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldCoffeeName1 = new javax.swing.JTextField();
        jTextFieldCoffeeName2 = new javax.swing.JTextField();
        jTextFieldCoffeeName3 = new javax.swing.JTextField();
        jTextFieldCoffeeName4 = new javax.swing.JTextField();
        jTextFieldCoffeeName5 = new javax.swing.JTextField();
        jTextFieldCoffeeName6 = new javax.swing.JTextField();
        jTextFieldCoffeeAmount5 = new javax.swing.JTextField();
        jTextFieldCoffeePrice4 = new javax.swing.JTextField();
        jTextFieldCoffeePrice3 = new javax.swing.JTextField();
        jTextFieldCoffeePrice2 = new javax.swing.JTextField();
        jTextFieldCoffeePrice1 = new javax.swing.JTextField();
        jTextFieldCoffeePrice5 = new javax.swing.JTextField();
        jTextFieldCoffeeAmount4 = new javax.swing.JTextField();
        jTextFieldCoffeeAmount2 = new javax.swing.JTextField();
        jTextFieldCoffeeAmount1 = new javax.swing.JTextField();
        jTextFieldCoffeeAmount3 = new javax.swing.JTextField();
        jTextFieldCoffeeAmount6 = new javax.swing.JTextField();
        jTextFieldCoffeePrice6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldBurgerName1 = new javax.swing.JTextField();
        jTextFieldBurgerName2 = new javax.swing.JTextField();
        jTextFieldBurgerName4 = new javax.swing.JTextField();
        jTextFieldBurgerName5 = new javax.swing.JTextField();
        jTextFieldBurgerName6 = new javax.swing.JTextField();
        jTextFieldBurgerName7 = new javax.swing.JTextField();
        jTextFieldBurgerName8 = new javax.swing.JTextField();
        jTextFieldBurgerName3 = new javax.swing.JTextField();
        jTextFieldBurgerPrice1 = new javax.swing.JTextField();
        jTextFieldBurgerName9 = new javax.swing.JTextField();
        jTextFieldBurgerAmount1 = new javax.swing.JTextField();
        jTextFieldBurgerPrice2 = new javax.swing.JTextField();
        jTextFieldBurgerPrice3 = new javax.swing.JTextField();
        jTextFieldBurgerPrice4 = new javax.swing.JTextField();
        jTextFieldBurgerPrice6 = new javax.swing.JTextField();
        jTextFieldBurgerPrice7 = new javax.swing.JTextField();
        jTextFieldBurgerPrice5 = new javax.swing.JTextField();
        jTextFieldBurgerPrice9 = new javax.swing.JTextField();
        jTextFieldBurgerPrice8 = new javax.swing.JTextField();
        jTextFieldBurgerAmount7 = new javax.swing.JTextField();
        jTextFieldBurgerAmount4 = new javax.swing.JTextField();
        jTextFieldBurgerAmount5 = new javax.swing.JTextField();
        jTextFieldBurgerAmount6 = new javax.swing.JTextField();
        jTextFieldBurgerAmount2 = new javax.swing.JTextField();
        jTextFieldBurgerAmount3 = new javax.swing.JTextField();
        jTextFieldBurgerAmount9 = new javax.swing.JTextField();
        jTextFieldBurgerAmount8 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldDrinksName1 = new javax.swing.JTextField();
        jTextFieldDrinksName2 = new javax.swing.JTextField();
        jTextFieldDrinksName4 = new javax.swing.JTextField();
        jTextFieldDrinksName5 = new javax.swing.JTextField();
        jTextFieldDrinksName3 = new javax.swing.JTextField();
        jTextFieldDrinksPrice1 = new javax.swing.JTextField();
        jTextFieldDrinksPrice2 = new javax.swing.JTextField();
        jTextFieldDrinksPrice3 = new javax.swing.JTextField();
        jTextFieldDrinksPrice4 = new javax.swing.JTextField();
        jTextFieldDrinksPrice5 = new javax.swing.JTextField();
        jTextFieldDrinksAmount2 = new javax.swing.JTextField();
        jTextFieldDrinksAmount1 = new javax.swing.JTextField();
        jTextFieldDrinksAmount3 = new javax.swing.JTextField();
        jTextFieldDrinksAmount4 = new javax.swing.JTextField();
        jTextFieldDrinksAmount5 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelyu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelCostOFDrinks = new javax.swing.JLabel();
        jLabelCostOFCoffee = new javax.swing.JLabel();
        jLabelCostOFBurger = new javax.swing.JLabel();
        jLabelTotalCost = new javax.swing.JLabel();
        jLabelSubTotal = new javax.swing.JLabel();
        jLabelReturn = new javax.swing.JLabel();
        jLabelTotalTax = new javax.swing.JLabel();
        jTextFieldPayment = new javax.swing.JTextField();
        jTextFieldTaxRate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burger and Coffee Point Management System by R2HBD");
        setForeground(new java.awt.Color(204, 255, 204));
        setName("Burger and Coffee Point Management System"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAFE System");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jTextAreaBill.setColumns(20);
        jTextAreaBill.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaBill.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jButtonReceipt.setBackground(new java.awt.Color(255, 153, 255));
        jButtonReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReceipt.setForeground(new java.awt.Color(255, 0, 153));
        jButtonReceipt.setText("Receipt");
        jButtonReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiptActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(255, 153, 255));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 0, 153));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonPrint.setBackground(new java.awt.Color(255, 153, 255));
        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPrint.setForeground(new java.awt.Color(255, 0, 153));
        jButtonPrint.setText("Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(255, 153, 255));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 0, 153));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonTotal.setBackground(new java.awt.Color(255, 153, 255));
        jButtonTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTotal.setForeground(new java.awt.Color(255, 0, 153));
        jButtonTotal.setText("Total");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jButtonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldCoffeeName1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeName1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeName1.setText("Cappuccino");
        jTextFieldCoffeeName1.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeName1.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldCoffeeName2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeName2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeName2.setText("Espresso");
        jTextFieldCoffeeName2.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeName2.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldCoffeeName3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeName3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeName3.setText("Black");
        jTextFieldCoffeeName3.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeName3.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldCoffeeName4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeName4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeName4.setText("Americano");
        jTextFieldCoffeeName4.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeName4.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldCoffeeName5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeName5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeName5.setText("Flat");
        jTextFieldCoffeeName5.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeName5.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldCoffeeName6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeName6.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeName6.setText("Turkish");
        jTextFieldCoffeeName6.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeName6.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldCoffeeAmount5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeAmount5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeAmount5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeeAmount5.setText("0");
        jTextFieldCoffeeAmount5.setToolTipText("");
        jTextFieldCoffeeAmount5.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeAmount5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeeAmount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeeAmount5ActionPerformed(evt);
            }
        });

        jTextFieldCoffeePrice4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeePrice4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeePrice4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeePrice4.setText("265");
        jTextFieldCoffeePrice4.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeePrice4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeePrice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeePrice4ActionPerformed(evt);
            }
        });

        jTextFieldCoffeePrice3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeePrice3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeePrice3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeePrice3.setText("185");
        jTextFieldCoffeePrice3.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeePrice3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeePrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeePrice3ActionPerformed(evt);
            }
        });

        jTextFieldCoffeePrice2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeePrice2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeePrice2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeePrice2.setText("310");
        jTextFieldCoffeePrice2.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeePrice2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeePrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeePrice2ActionPerformed(evt);
            }
        });

        jTextFieldCoffeePrice1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeePrice1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeePrice1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeePrice1.setText("225");
        jTextFieldCoffeePrice1.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeePrice1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeePrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeePrice1ActionPerformed(evt);
            }
        });

        jTextFieldCoffeePrice5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeePrice5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeePrice5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeePrice5.setText("99");
        jTextFieldCoffeePrice5.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeePrice5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeePrice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeePrice5ActionPerformed(evt);
            }
        });

        jTextFieldCoffeeAmount4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeAmount4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeAmount4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeeAmount4.setText("0");
        jTextFieldCoffeeAmount4.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeAmount4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeeAmount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeeAmount4ActionPerformed(evt);
            }
        });

        jTextFieldCoffeeAmount2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeAmount2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeAmount2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeeAmount2.setText("0");
        jTextFieldCoffeeAmount2.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeAmount2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeeAmount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeeAmount2ActionPerformed(evt);
            }
        });

        jTextFieldCoffeeAmount1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeAmount1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeAmount1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeeAmount1.setText("0");
        jTextFieldCoffeeAmount1.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeAmount1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeeAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeeAmount1ActionPerformed(evt);
            }
        });

        jTextFieldCoffeeAmount3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeAmount3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeAmount3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeeAmount3.setText("0");
        jTextFieldCoffeeAmount3.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeAmount3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeeAmount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeeAmount3ActionPerformed(evt);
            }
        });

        jTextFieldCoffeeAmount6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeeAmount6.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeeAmount6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeeAmount6.setText("0");
        jTextFieldCoffeeAmount6.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeeAmount6.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeeAmount6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeeAmount6ActionPerformed(evt);
            }
        });

        jTextFieldCoffeePrice6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCoffeePrice6.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldCoffeePrice6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCoffeePrice6.setText("230");
        jTextFieldCoffeePrice6.setCaretColor(new java.awt.Color(204, 0, 102));
        jTextFieldCoffeePrice6.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldCoffeePrice6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoffeePrice6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldCoffeeName6, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCoffeePrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeePrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeePrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeePrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeePrice5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeePrice6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCoffeeAmount5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeAmount4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeAmount2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeAmount1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeAmount3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jTextFieldCoffeeAmount6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCoffeeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeePrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeeAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCoffeeName2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeeAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCoffeeName3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeePrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeeAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCoffeeName4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeePrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeeAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCoffeeName5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeeAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeePrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCoffeeName6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeeAmount6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCoffeePrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldBurgerName1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName1.setText("God Father 1");
        jTextFieldBurgerName1.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName1.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldBurgerName2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName2.setText("God Father 2");
        jTextFieldBurgerName2.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName2ActionPerformed(evt);
            }
        });

        jTextFieldBurgerName4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName4.setText("Zinger Burger");
        jTextFieldBurgerName4.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName4.setPreferredSize(new java.awt.Dimension(54, 20));

        jTextFieldBurgerName5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName5.setText("Viggie Burger");
        jTextFieldBurgerName5.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName5ActionPerformed(evt);
            }
        });

        jTextFieldBurgerName6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName6.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName6.setText("Tower Zinger");
        jTextFieldBurgerName6.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName6.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName6ActionPerformed(evt);
            }
        });

        jTextFieldBurgerName7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName7.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName7.setText("Fusion Burger");
        jTextFieldBurgerName7.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName7.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName7ActionPerformed(evt);
            }
        });

        jTextFieldBurgerName8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName8.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName8.setText("Chicken Snacker");
        jTextFieldBurgerName8.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName8.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName8ActionPerformed(evt);
            }
        });

        jTextFieldBurgerName3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName3.setText("Hot Zinger Burger");
        jTextFieldBurgerName3.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName3ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice1.setText("319");
        jTextFieldBurgerPrice1.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice1ActionPerformed(evt);
            }
        });

        jTextFieldBurgerName9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerName9.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerName9.setText("Chicken Sub");
        jTextFieldBurgerName9.setToolTipText("");
        jTextFieldBurgerName9.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerName9.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerName9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerName9ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount1.setText("0");
        jTextFieldBurgerAmount1.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount1ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice2.setText("439");
        jTextFieldBurgerPrice2.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice2ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice3.setText("200");
        jTextFieldBurgerPrice3.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice3ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice4.setText("279");
        jTextFieldBurgerPrice4.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice4ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice6.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice6.setText("459");
        jTextFieldBurgerPrice6.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice6.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice6ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice7.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice7.setText("289");
        jTextFieldBurgerPrice7.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice7.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice7ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice5.setText("269");
        jTextFieldBurgerPrice5.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice5ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice9.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice9.setText("219");
        jTextFieldBurgerPrice9.setToolTipText("");
        jTextFieldBurgerPrice9.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice9.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice9ActionPerformed(evt);
            }
        });

        jTextFieldBurgerPrice8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerPrice8.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerPrice8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerPrice8.setText("129");
        jTextFieldBurgerPrice8.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerPrice8.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerPrice8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerPrice8ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount7.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount7.setText("0");
        jTextFieldBurgerAmount7.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount7.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount7ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount4.setText("0");
        jTextFieldBurgerAmount4.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount4ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount5.setText("0");
        jTextFieldBurgerAmount5.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount5ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount6.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount6.setText("0");
        jTextFieldBurgerAmount6.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount6.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount6ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount2.setText("0");
        jTextFieldBurgerAmount2.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount2ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount3.setText("0");
        jTextFieldBurgerAmount3.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount3ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount9.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount9.setText("0");
        jTextFieldBurgerAmount9.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount9.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount9ActionPerformed(evt);
            }
        });

        jTextFieldBurgerAmount8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBurgerAmount8.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldBurgerAmount8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBurgerAmount8.setText("0");
        jTextFieldBurgerAmount8.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldBurgerAmount8.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldBurgerAmount8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBurgerAmount8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldBurgerName8, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerName9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldBurgerPrice4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBurgerPrice9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldBurgerAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldBurgerAmount4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldBurgerAmount5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextFieldBurgerAmount6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldBurgerAmount7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldBurgerAmount9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldBurgerAmount8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldBurgerAmount2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldBurgerAmount3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBurgerName9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerPrice9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBurgerAmount9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel6.setForeground(new java.awt.Color(0, 204, 204));

        jTextFieldDrinksName1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksName1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksName1.setText("Aquafina");
        jTextFieldDrinksName1.setToolTipText("");
        jTextFieldDrinksName1.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksName1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksName1ActionPerformed(evt);
            }
        });

        jTextFieldDrinksName2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksName2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksName2.setText("Pepsi");
        jTextFieldDrinksName2.setToolTipText("");
        jTextFieldDrinksName2.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksName2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksName2ActionPerformed(evt);
            }
        });

        jTextFieldDrinksName4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksName4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksName4.setText("7 UP");
        jTextFieldDrinksName4.setToolTipText("");
        jTextFieldDrinksName4.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksName4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksName4ActionPerformed(evt);
            }
        });

        jTextFieldDrinksName5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksName5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksName5.setText("Tee");
        jTextFieldDrinksName5.setToolTipText("");
        jTextFieldDrinksName5.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksName5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksName5ActionPerformed(evt);
            }
        });

        jTextFieldDrinksName3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksName3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksName3.setText("CocaCola");
        jTextFieldDrinksName3.setToolTipText("");
        jTextFieldDrinksName3.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksName3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksName3ActionPerformed(evt);
            }
        });

        jTextFieldDrinksPrice1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksPrice1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksPrice1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksPrice1.setText("15");
        jTextFieldDrinksPrice1.setToolTipText("");
        jTextFieldDrinksPrice1.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksPrice1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksPrice1ActionPerformed(evt);
            }
        });

        jTextFieldDrinksPrice2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksPrice2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksPrice2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksPrice2.setText("70");
        jTextFieldDrinksPrice2.setToolTipText("");
        jTextFieldDrinksPrice2.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksPrice2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksPrice2ActionPerformed(evt);
            }
        });

        jTextFieldDrinksPrice3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksPrice3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksPrice3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksPrice3.setText("70");
        jTextFieldDrinksPrice3.setToolTipText("");
        jTextFieldDrinksPrice3.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksPrice3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksPrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksPrice3ActionPerformed(evt);
            }
        });

        jTextFieldDrinksPrice4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksPrice4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksPrice4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksPrice4.setText("50");
        jTextFieldDrinksPrice4.setToolTipText("");
        jTextFieldDrinksPrice4.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksPrice4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksPrice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksPrice4ActionPerformed(evt);
            }
        });

        jTextFieldDrinksPrice5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksPrice5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksPrice5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksPrice5.setText("50");
        jTextFieldDrinksPrice5.setToolTipText("");
        jTextFieldDrinksPrice5.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksPrice5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksPrice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksPrice5ActionPerformed(evt);
            }
        });

        jTextFieldDrinksAmount2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksAmount2.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksAmount2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksAmount2.setText("0");
        jTextFieldDrinksAmount2.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksAmount2.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksAmount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksAmount2ActionPerformed(evt);
            }
        });

        jTextFieldDrinksAmount1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksAmount1.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksAmount1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksAmount1.setText("0");
        jTextFieldDrinksAmount1.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksAmount1.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksAmount1ActionPerformed(evt);
            }
        });

        jTextFieldDrinksAmount3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksAmount3.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksAmount3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksAmount3.setText("0");
        jTextFieldDrinksAmount3.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksAmount3.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksAmount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksAmount3ActionPerformed(evt);
            }
        });

        jTextFieldDrinksAmount4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksAmount4.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksAmount4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksAmount4.setText("0");
        jTextFieldDrinksAmount4.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksAmount4.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksAmount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksAmount4ActionPerformed(evt);
            }
        });

        jTextFieldDrinksAmount5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldDrinksAmount5.setForeground(new java.awt.Color(0, 153, 102));
        jTextFieldDrinksAmount5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDrinksAmount5.setText("0");
        jTextFieldDrinksAmount5.setCaretColor(new java.awt.Color(255, 0, 153));
        jTextFieldDrinksAmount5.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldDrinksAmount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDrinksAmount5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldDrinksName4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksName3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksName2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDrinksPrice4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksPrice3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksPrice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksPrice5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDrinksPrice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldDrinksAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDrinksAmount1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldDrinksAmount3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldDrinksAmount4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDrinksAmount5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDrinksName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDrinksName2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDrinksName3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDrinksName4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDrinksName5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDrinksAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel7.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 102));
        jLabel3.setText("Tax Rate (%) :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 102));
        jLabel4.setText("Cost of Coffee :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 102));
        jLabel5.setText("Cost of Burger :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 102));
        jLabel6.setText("Sub Total :");

        jLabelyu.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelyu.setForeground(new java.awt.Color(0, 204, 102));
        jLabelyu.setText("Total Tax :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 102));
        jLabel8.setText("Total Cost :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 102));
        jLabel10.setText("Return :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 102));
        jLabel11.setText("Cost of Drinks :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 102));
        jLabel12.setText("Payment :");

        jLabelCostOFDrinks.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelCostOFDrinks.setForeground(new java.awt.Color(0, 204, 102));
        jLabelCostOFDrinks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCostOFDrinks.setText("00 BDT");

        jLabelCostOFCoffee.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelCostOFCoffee.setForeground(new java.awt.Color(0, 204, 102));
        jLabelCostOFCoffee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCostOFCoffee.setText("00 BDT");

        jLabelCostOFBurger.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelCostOFBurger.setForeground(new java.awt.Color(0, 204, 102));
        jLabelCostOFBurger.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCostOFBurger.setText("00 BDT");

        jLabelTotalCost.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelTotalCost.setForeground(new java.awt.Color(0, 204, 102));
        jLabelTotalCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotalCost.setText("00 BDT");

        jLabelSubTotal.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelSubTotal.setForeground(new java.awt.Color(0, 204, 102));
        jLabelSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSubTotal.setText("00 BDT");

        jLabelReturn.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelReturn.setForeground(new java.awt.Color(0, 204, 102));
        jLabelReturn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelReturn.setText("00 BDT");

        jLabelTotalTax.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelTotalTax.setForeground(new java.awt.Color(0, 204, 102));
        jLabelTotalTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotalTax.setText("00 BDT");

        jTextFieldPayment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPayment.setForeground(new java.awt.Color(0, 204, 102));
        jTextFieldPayment.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldPayment.setText("0");
        jTextFieldPayment.setToolTipText("");
        jTextFieldPayment.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaymentActionPerformed(evt);
            }
        });

        jTextFieldTaxRate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldTaxRate.setForeground(new java.awt.Color(0, 204, 102));
        jTextFieldTaxRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTaxRate.setText("05");
        jTextFieldTaxRate.setToolTipText("");
        jTextFieldTaxRate.setPreferredSize(new java.awt.Dimension(54, 20));
        jTextFieldTaxRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCostOFDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCostOFCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotalCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelyu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jTextFieldTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCostOFBurger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTaxRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCostOFBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCostOFDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCostOFCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelyu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Burger and Coffee Point Management System by R2HBD");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBurgerName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerName5ActionPerformed

    private void jTextFieldBurgerName6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName6ActionPerformed
        
    }//GEN-LAST:event_jTextFieldBurgerName6ActionPerformed

    private void jTextFieldBurgerName7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName7ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerName7ActionPerformed

    private void jTextFieldBurgerName8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName8ActionPerformed
        
    }//GEN-LAST:event_jTextFieldBurgerName8ActionPerformed

    private void jTextFieldBurgerName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName3ActionPerformed
        
    }//GEN-LAST:event_jTextFieldBurgerName3ActionPerformed

    private void jTextFieldBurgerPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice1ActionPerformed
        
    }//GEN-LAST:event_jTextFieldBurgerPrice1ActionPerformed

    private void jTextFieldBurgerName9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName9ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerName9ActionPerformed

    private void jTextFieldBurgerAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount1ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount1ActionPerformed

    private void jTextFieldBurgerPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice2ActionPerformed

    private void jTextFieldBurgerPrice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice3ActionPerformed

    private void jTextFieldBurgerPrice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice4ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice4ActionPerformed

    private void jTextFieldBurgerPrice6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice6ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice6ActionPerformed

    private void jTextFieldBurgerPrice7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice7ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice7ActionPerformed

    private void jTextFieldBurgerPrice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice5ActionPerformed

    private void jTextFieldBurgerPrice9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice9ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerPrice9ActionPerformed

    private void jTextFieldBurgerPrice8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerPrice8ActionPerformed
        
    }//GEN-LAST:event_jTextFieldBurgerPrice8ActionPerformed

    private void jTextFieldBurgerAmount7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount7ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount7ActionPerformed

    private void jTextFieldBurgerAmount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount4ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount4ActionPerformed

    private void jTextFieldBurgerAmount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount5ActionPerformed

    private void jTextFieldBurgerAmount6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount6ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount6ActionPerformed

    private void jTextFieldBurgerAmount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount2ActionPerformed

    private void jTextFieldBurgerAmount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount3ActionPerformed

    private void jTextFieldBurgerAmount9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount9ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount9ActionPerformed

    private void jTextFieldBurgerAmount8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerAmount8ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerAmount8ActionPerformed

    private void jTextFieldBurgerName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBurgerName2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldBurgerName2ActionPerformed

    private void jTextFieldDrinksName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksName1ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksName1ActionPerformed

    private void jTextFieldDrinksName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksName2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksName2ActionPerformed

    private void jTextFieldDrinksName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksName4ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksName4ActionPerformed

    private void jTextFieldDrinksName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksName5ActionPerformed
        
    }//GEN-LAST:event_jTextFieldDrinksName5ActionPerformed

    private void jTextFieldDrinksName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksName3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksName3ActionPerformed

    private void jTextFieldDrinksPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksPrice1ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksPrice1ActionPerformed

    private void jTextFieldDrinksPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksPrice2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksPrice2ActionPerformed

    private void jTextFieldDrinksPrice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksPrice3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksPrice3ActionPerformed

    private void jTextFieldDrinksPrice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksPrice4ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksPrice4ActionPerformed

    private void jTextFieldDrinksPrice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksPrice5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksPrice5ActionPerformed

    private void jTextFieldDrinksAmount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksAmount2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksAmount2ActionPerformed

    private void jTextFieldDrinksAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksAmount1ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksAmount1ActionPerformed

    private void jTextFieldDrinksAmount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksAmount3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksAmount3ActionPerformed

    private void jTextFieldDrinksAmount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksAmount4ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksAmount4ActionPerformed

    private void jTextFieldDrinksAmount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDrinksAmount5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldDrinksAmount5ActionPerformed

    private void jTextFieldCoffeeAmount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeeAmount5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeeAmount5ActionPerformed

    private void jTextFieldCoffeePrice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeePrice4ActionPerformed
        
    }//GEN-LAST:event_jTextFieldCoffeePrice4ActionPerformed

    private void jTextFieldCoffeePrice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeePrice3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeePrice3ActionPerformed

    private void jTextFieldCoffeePrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeePrice2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeePrice2ActionPerformed

    private void jTextFieldCoffeePrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeePrice1ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeePrice1ActionPerformed

    private void jTextFieldCoffeePrice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeePrice5ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeePrice5ActionPerformed

    private void jTextFieldCoffeeAmount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeeAmount4ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeeAmount4ActionPerformed

    private void jTextFieldCoffeeAmount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeeAmount2ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeeAmount2ActionPerformed

    private void jTextFieldCoffeeAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeeAmount1ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeeAmount1ActionPerformed

    private void jTextFieldCoffeeAmount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeeAmount3ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeeAmount3ActionPerformed

    private void jTextFieldCoffeeAmount6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeeAmount6ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeeAmount6ActionPerformed

    private void jTextFieldCoffeePrice6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoffeePrice6ActionPerformed
         
    }//GEN-LAST:event_jTextFieldCoffeePrice6ActionPerformed

    private void jTextFieldPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaymentActionPerformed
         
    }//GEN-LAST:event_jTextFieldPaymentActionPerformed

    private void jTextFieldTaxRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxRateActionPerformed
         
    }//GEN-LAST:event_jTextFieldTaxRateActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
         
        
        jTextAreaBill.setText(jTextAreaBill.getText());
        
        
        try{
            
            jTextAreaBill.print();
        }
        
        catch(PrinterException e){
            
            System.err.format("No Printer Prond", e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
         
        
         System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
         
        
         
        burgerName1 = jTextFieldBurgerName1.getText();
        burgerName2 = jTextFieldBurgerName2.getText();
        burgerName3 = jTextFieldBurgerName3.getText();
        burgerName4 = jTextFieldBurgerName4.getText();
        burgerName5 = jTextFieldBurgerName5.getText();
        burgerName6 = jTextFieldBurgerName6.getText();
        burgerName7 = jTextFieldBurgerName7.getText();
        burgerName8 = jTextFieldBurgerName8.getText();
        burgerName9 = jTextFieldBurgerName9.getText();
        
         
        drinksName1 = jTextFieldDrinksName1.getText();
        drinksName2 = jTextFieldDrinksName2.getText();
        drinksName3 = jTextFieldDrinksName3.getText();
        drinksName4 = jTextFieldDrinksName4.getText();
        drinksName5 = jTextFieldDrinksName5.getText();
        
         
        coffeeName1 = jTextFieldCoffeeName1.getText();
        coffeeName2 = jTextFieldCoffeeName2.getText();
        coffeeName3 = jTextFieldCoffeeName3.getText();
        coffeeName4 = jTextFieldCoffeeName4.getText();
        coffeeName5 = jTextFieldCoffeeName5.getText();
        coffeeName6 = jTextFieldCoffeeName6.getText();
        
        
        
        
         
        numberofBurger1 = Integer.parseInt(jTextFieldBurgerAmount1.getText());
        numberofBurger2 = Integer.parseInt(jTextFieldBurgerAmount2.getText());
        numberofBurger3 = Integer.parseInt(jTextFieldBurgerAmount3.getText());
        numberofBurger4 = Integer.parseInt(jTextFieldBurgerAmount4.getText());
        numberofBurger5 = Integer.parseInt(jTextFieldBurgerAmount5.getText());
        numberofBurger6 = Integer.parseInt(jTextFieldBurgerAmount6.getText());
        numberofBurger7 = Integer.parseInt(jTextFieldBurgerAmount7.getText());
        numberofBurger8 = Integer.parseInt(jTextFieldBurgerAmount8.getText());
        numberofBurger9 = Integer.parseInt(jTextFieldBurgerAmount9.getText());
        
         
        numberofDrinks1 = Integer.parseInt(jTextFieldDrinksAmount1.getText());
        numberofDrinks2 = Integer.parseInt(jTextFieldDrinksAmount2.getText());
        numberofDrinks3 = Integer.parseInt(jTextFieldDrinksAmount3.getText());
        numberofDrinks4 = Integer.parseInt(jTextFieldDrinksAmount4.getText());
        numberofDrinks5 = Integer.parseInt(jTextFieldDrinksAmount5.getText());
        
          
        numberofCoffee1 = Integer.parseInt(jTextFieldCoffeeAmount1.getText());
        numberofCoffee2 = Integer.parseInt(jTextFieldCoffeeAmount2.getText());
        numberofCoffee3 = Integer.parseInt(jTextFieldCoffeeAmount3.getText());
        numberofCoffee4 = Integer.parseInt(jTextFieldCoffeeAmount4.getText());
        numberofCoffee5 = Integer.parseInt(jTextFieldCoffeeAmount5.getText());
        numberofCoffee6 = Integer.parseInt(jTextFieldCoffeeAmount6.getText());
        
        
        
        
        
         
        priceofBurger1 = Integer.parseInt(jTextFieldBurgerPrice1.getText());
        priceofBurger2 = Integer.parseInt(jTextFieldBurgerPrice2.getText());
        priceofBurger3 = Integer.parseInt(jTextFieldBurgerPrice3.getText());
        priceofBurger4 = Integer.parseInt(jTextFieldBurgerPrice4.getText());
        priceofBurger5 = Integer.parseInt(jTextFieldBurgerPrice5.getText());
        priceofBurger6 = Integer.parseInt(jTextFieldBurgerPrice6.getText());
        priceofBurger7 = Integer.parseInt(jTextFieldBurgerPrice7.getText());
        priceofBurger8 = Integer.parseInt(jTextFieldBurgerPrice8.getText());
        priceofBurger9 = Integer.parseInt(jTextFieldBurgerPrice9.getText());
        
         
        priceOfDrinks1 = Integer.parseInt(jTextFieldDrinksPrice1.getText());
        priceOfDrinks2 = Integer.parseInt(jTextFieldDrinksPrice2.getText());
        priceOfDrinks3 = Integer.parseInt(jTextFieldDrinksPrice3.getText());
        priceOfDrinks4 = Integer.parseInt(jTextFieldDrinksPrice4.getText());
        priceOfDrinks5 = Integer.parseInt(jTextFieldDrinksPrice5.getText());
        
         
        priceOfCoffee1 = Integer.parseInt(jTextFieldCoffeePrice1.getText());
        priceOfCoffee2 = Integer.parseInt(jTextFieldCoffeePrice2.getText());
        priceOfCoffee3 = Integer.parseInt(jTextFieldCoffeePrice3.getText());
        priceOfCoffee4 = Integer.parseInt(jTextFieldCoffeePrice4.getText());
        priceOfCoffee5 = Integer.parseInt(jTextFieldCoffeePrice5.getText());
        priceOfCoffee6 = Integer.parseInt(jTextFieldCoffeePrice6.getText());
        
        
        
        
         
        billofBurger1 = numberofBurger1 * priceofBurger1;
        billofBurger2 = numberofBurger2 * priceofBurger2;
        billofBurger3 = numberofBurger3 * priceofBurger3;
        billofBurger4 = numberofBurger4 * priceofBurger4;
        billofBurger5 = numberofBurger5 * priceofBurger5;
        billofBurger6 = numberofBurger6 * priceofBurger6;
        billofBurger7 = numberofBurger7 * priceofBurger7;
        billofBurger8 = numberofBurger8 * priceofBurger8;
        billofBurger9 = numberofBurger9 * priceofBurger9;
        
          
        billofDrinks1 = numberofDrinks1 * priceOfDrinks1;
        billofDrinks2 = numberofDrinks2 * priceOfDrinks2;
        billofDrinks3 = numberofDrinks3 * priceOfDrinks3;
        billofDrinks4 = numberofDrinks4 * priceOfDrinks4;
        billofDrinks5 = numberofDrinks5 * priceOfDrinks5;
        
         
        billofCoffee1 = numberofCoffee1 * priceOfCoffee1;
        billofCoffee2 = numberofCoffee2 * priceOfCoffee2;
        billofCoffee3 = numberofCoffee3 * priceOfCoffee3;
        billofCoffee4 = numberofCoffee4 * priceOfCoffee4;
        billofCoffee5 = numberofCoffee5 * priceOfCoffee5;
        billofCoffee6 = numberofCoffee6 * priceOfCoffee6;
        
        
        
         
        rateoftax = Integer.parseInt(jTextFieldTaxRate.getText());
        
         
        costOfBurger = billofBurger1 + billofBurger2 + billofBurger3 + billofBurger4 + billofBurger5 + billofBurger6 + billofBurger7 + billofBurger8 + billofBurger9;
        
        costofDrinks = billofDrinks1 + billofDrinks2 + billofDrinks3 + billofDrinks4 + billofDrinks5;
        
        costofCoffee = billofCoffee1 + billofCoffee2 + billofCoffee3 + billofCoffee4 + billofCoffee5 + billofCoffee6;
        
        subCost = costOfBurger + costofDrinks + costofCoffee;
        
        totaltax =((subCost * rateoftax) / 100.00);
        
        totalCost = subCost + totaltax;
        
        
        jLabelCostOFBurger.setText(String.valueOf(costOfBurger) + " BDT");
        jLabelCostOFDrinks.setText(String.valueOf(costofDrinks) + " BDT");
        jLabelCostOFCoffee.setText(String.valueOf(costofCoffee) + " BDT");
        jLabelSubTotal.setText(String.valueOf(subCost) + " BDT");
        jLabelTotalTax.setText(String.valueOf(totaltax) + " BDT");
        jLabelTotalCost.setText(String.valueOf(totalCost) + " BDT");
        
        
        amountOfBurger = numberofBurger1 + numberofBurger2 + numberofBurger3 + numberofBurger4 + numberofBurger5 + numberofBurger6 + numberofBurger7 + numberofBurger8 + numberofBurger9;
        amountOfDrinks = numberofDrinks1 +  numberofDrinks2 +  numberofDrinks3 +  numberofDrinks4 +  numberofDrinks5;
        amountOfCoffee = numberofCoffee1 + numberofCoffee2 + numberofCoffee3 + numberofCoffee4 + numberofCoffee5 + numberofCoffee6;
        
        
        viewamountOfBurger = "\nAmount of Burger : " + amountOfBurger  + " PCs";
        viewamountOfDrinks = "\nAmount of Drinks : " + amountOfDrinks  + " PCs\n";
        viewamountOfCoffee = "\nAmount of Coffee : " + amountOfCoffee + " PCs\n";
        
        
    
        
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jButtonReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiptActionPerformed
         
        billText = "Burger and Coffee Point Management System,\nDhaka, Bangladesh\n" + date;
        paymentamount = Integer.parseInt(jTextFieldPayment.getText());
        paymentreturn = (int)(paymentamount - totalCost);
        jLabelReturn.setText(String.valueOf(paymentreturn) + " BDT");
        
        
        
       
        
        line3 = "\n******************************************\n";
        line1 = "Burger and Coffee Point Management System,\nDhaka, Bangladesh\n";
        billTaxRate = "Tax Rate         : " + rateoftax + " %\n";
        billBurger = "\nCost of Burger   : " +  costOfBurger + " BDT";
        billDrinks = "Cost of Drinks   : " + costofDrinks + " BDT";
        billCoffee = "Cost of Coffee   : " + costofCoffee + " BDT\n";
        billSubTotal = "Sub Total        : " + subCost + " BDT\n";
        billTax = "Total Tax        : " + totaltax + " BDT\n";
        billTotalCost = "Total Cost       : " +  totalCost + " BDT\n";
        billPayment = "Payment          : " +  paymentamount +  " BDT\n";
        billReturn = "Return           : " +  (int)paymentreturn + " BDT\n";
         
        billline2 = "Thanks for being with us!";
        
        line = line3 + line1 + date + line3 + viewamountOfBurger + billBurger + viewamountOfDrinks + billDrinks + viewamountOfCoffee + billCoffee + billSubTotal + billTaxRate + billTax + billTotalCost + billPayment + billReturn + line3 +  billline2 + line3;
        jTextAreaBill.setText(line);
        
        
       
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
            
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcpmsdb18", "root", "");
           st = con.createStatement(); 
           String query = "insert into data18(subTotal,taxRate,totalTax,totalCost,comment)values('"+subCost+"','"+rateoftax+"','"+totaltax+"','"+totalCost+"', 'Shaikh Hasibul Islam')";
           st.executeUpdate(query);
            
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error!" + ex);
        }
        
        
      
        
        
     
    }//GEN-LAST:event_jButtonReceiptActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
         
        
         
         
        
        jTextFieldBurgerAmount1.setText("0");
        jTextFieldBurgerAmount2.setText("0");
        jTextFieldBurgerAmount3.setText("0");
        jTextFieldBurgerAmount4.setText("0");
        jTextFieldBurgerAmount5.setText("0");
        jTextFieldBurgerAmount6.setText("0");
        jTextFieldBurgerAmount7.setText("0");
        jTextFieldBurgerAmount8.setText("0");
        jTextFieldBurgerAmount9.setText("0");
        
        jTextFieldDrinksAmount1.setText("0");
        jTextFieldDrinksAmount2.setText("0");
        jTextFieldDrinksAmount3.setText("0");
        jTextFieldDrinksAmount4.setText("0");
        jTextFieldDrinksAmount5.setText("0");
        
        jTextFieldCoffeeAmount1.setText("0");
        jTextFieldCoffeeAmount2.setText("0");
        jTextFieldCoffeeAmount3.setText("0");
        jTextFieldCoffeeAmount4.setText("0");
        jTextFieldCoffeeAmount5.setText("0");
        jTextFieldCoffeeAmount6.setText("0");
        
        jTextFieldTaxRate.setText("05");
        jTextFieldPayment.setText("0");
        
        jLabelCostOFBurger.setText("00 BDT");
        jLabelCostOFDrinks.setText("00 BDT");
        jLabelCostOFCoffee.setText("00 BDT");
        jLabelSubTotal.setText("00 BDT");
        jLabelTotalTax.setText("00 BDT");
        jLabelTotalCost.setText("00 BDT");
        jLabelReturn.setText("00 BDT");        
    }//GEN-LAST:event_jButtonResetActionPerformed

    
    public static void main(String args[]) {
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoffeeAndBurgerPontManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoffeeAndBurgerPontManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoffeeAndBurgerPontManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoffeeAndBurgerPontManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
        java.awt.EventQueue.invokeLater(() -> {
            new CoffeeAndBurgerPontManagementSystem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReceipt;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCostOFBurger;
    private javax.swing.JLabel jLabelCostOFCoffee;
    private javax.swing.JLabel jLabelCostOFDrinks;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelSubTotal;
    private javax.swing.JLabel jLabelTotalCost;
    private javax.swing.JLabel jLabelTotalTax;
    private javax.swing.JLabel jLabelyu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBill;
    private javax.swing.JTextField jTextFieldBurgerAmount1;
    private javax.swing.JTextField jTextFieldBurgerAmount2;
    private javax.swing.JTextField jTextFieldBurgerAmount3;
    private javax.swing.JTextField jTextFieldBurgerAmount4;
    private javax.swing.JTextField jTextFieldBurgerAmount5;
    private javax.swing.JTextField jTextFieldBurgerAmount6;
    private javax.swing.JTextField jTextFieldBurgerAmount7;
    private javax.swing.JTextField jTextFieldBurgerAmount8;
    private javax.swing.JTextField jTextFieldBurgerAmount9;
    private javax.swing.JTextField jTextFieldBurgerName1;
    private javax.swing.JTextField jTextFieldBurgerName2;
    private javax.swing.JTextField jTextFieldBurgerName3;
    private javax.swing.JTextField jTextFieldBurgerName4;
    private javax.swing.JTextField jTextFieldBurgerName5;
    private javax.swing.JTextField jTextFieldBurgerName6;
    private javax.swing.JTextField jTextFieldBurgerName7;
    private javax.swing.JTextField jTextFieldBurgerName8;
    private javax.swing.JTextField jTextFieldBurgerName9;
    private javax.swing.JTextField jTextFieldBurgerPrice1;
    private javax.swing.JTextField jTextFieldBurgerPrice2;
    private javax.swing.JTextField jTextFieldBurgerPrice3;
    private javax.swing.JTextField jTextFieldBurgerPrice4;
    private javax.swing.JTextField jTextFieldBurgerPrice5;
    private javax.swing.JTextField jTextFieldBurgerPrice6;
    private javax.swing.JTextField jTextFieldBurgerPrice7;
    private javax.swing.JTextField jTextFieldBurgerPrice8;
    private javax.swing.JTextField jTextFieldBurgerPrice9;
    private javax.swing.JTextField jTextFieldCoffeeAmount1;
    private javax.swing.JTextField jTextFieldCoffeeAmount2;
    private javax.swing.JTextField jTextFieldCoffeeAmount3;
    private javax.swing.JTextField jTextFieldCoffeeAmount4;
    private javax.swing.JTextField jTextFieldCoffeeAmount5;
    private javax.swing.JTextField jTextFieldCoffeeAmount6;
    private javax.swing.JTextField jTextFieldCoffeeName1;
    private javax.swing.JTextField jTextFieldCoffeeName2;
    private javax.swing.JTextField jTextFieldCoffeeName3;
    private javax.swing.JTextField jTextFieldCoffeeName4;
    private javax.swing.JTextField jTextFieldCoffeeName5;
    private javax.swing.JTextField jTextFieldCoffeeName6;
    private javax.swing.JTextField jTextFieldCoffeePrice1;
    private javax.swing.JTextField jTextFieldCoffeePrice2;
    private javax.swing.JTextField jTextFieldCoffeePrice3;
    private javax.swing.JTextField jTextFieldCoffeePrice4;
    private javax.swing.JTextField jTextFieldCoffeePrice5;
    private javax.swing.JTextField jTextFieldCoffeePrice6;
    private javax.swing.JTextField jTextFieldDrinksAmount1;
    private javax.swing.JTextField jTextFieldDrinksAmount2;
    private javax.swing.JTextField jTextFieldDrinksAmount3;
    private javax.swing.JTextField jTextFieldDrinksAmount4;
    private javax.swing.JTextField jTextFieldDrinksAmount5;
    private javax.swing.JTextField jTextFieldDrinksName1;
    private javax.swing.JTextField jTextFieldDrinksName2;
    private javax.swing.JTextField jTextFieldDrinksName3;
    private javax.swing.JTextField jTextFieldDrinksName4;
    private javax.swing.JTextField jTextFieldDrinksName5;
    private javax.swing.JTextField jTextFieldDrinksPrice1;
    private javax.swing.JTextField jTextFieldDrinksPrice2;
    private javax.swing.JTextField jTextFieldDrinksPrice3;
    private javax.swing.JTextField jTextFieldDrinksPrice4;
    private javax.swing.JTextField jTextFieldDrinksPrice5;
    private javax.swing.JTextField jTextFieldPayment;
    private javax.swing.JTextField jTextFieldTaxRate;
    // End of variables declaration//GEN-END:variables
}
