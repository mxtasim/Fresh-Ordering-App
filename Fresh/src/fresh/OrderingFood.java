package fresh;



import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sasindu
 */
public class OrderingFood extends javax.swing.JFrame {

    public OrderingFood() {
        
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        
              
    }

  public void addtable(int id ,String Name, int Qty ,Double Price){
  
      DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
      
      Vector v = new Vector() ;
      
      v.add(id);
      v.add(Name);
      v.add(Qty);
      v.add(Price);
      
      dt.addRow(v);
      
      
      
      
  
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    public void addtables(int id ,String Name,int Qty ,Double Price){
    
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        
       DecimalFormat df = new DecimalFormat("00.00") ;       
       double totPrice = Price * Double.valueOf(Qty) ;
       
       String TotalPrice = df.format(totPrice);
        
        
        
        // product allready add chk
        
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            
            if (Name == jTable1.getValueAt(row, 1)) {
                
                dt.removeRow(jTable1.convertRowIndexToModel(row));
                
            } 
        }
        
        
        
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price
        
        dt.addRow(v);
        
    
    }
    
   public void cal(){
    //cal total table values
   
   int numOfRow = jTable1.getRowCount() ;
   double tot = 0.0 ;
   
       for (int i = 0; i < numOfRow; i++) {
           
           double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
          
           tot += value ;
           
       }
       
       DecimalFormat df = new DecimalFormat("00.00") ;
       total.setText(df.format(tot));
    
   
   
   } 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        all = new javax.swing.JPanel();
        num1 = new javax.swing.JLabel();
        order2 = new javax.swing.JButton();
        num2 = new javax.swing.JLabel();
        order3 = new javax.swing.JButton();
        num3 = new javax.swing.JLabel();
        order7 = new javax.swing.JButton();
        num6 = new javax.swing.JLabel();
        order6 = new javax.swing.JButton();
        num5 = new javax.swing.JLabel();
        order5 = new javax.swing.JButton();
        num8 = new javax.swing.JLabel();
        order10 = new javax.swing.JButton();
        order9 = new javax.swing.JButton();
        num7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        order1 = new javax.swing.JButton();
        order11 = new javax.swing.JButton();
        num12 = new javax.swing.JLabel();
        order4 = new javax.swing.JButton();
        order8 = new javax.swing.JButton();
        num10 = new javax.swing.JLabel();
        num11 = new javax.swing.JLabel();
        num9 = new javax.swing.JLabel();
        order12 = new javax.swing.JButton();
        num4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fresh: Pizza Delivery & More");

        num1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setText("0");

        order2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_cheese.png"))); // NOI18N
        order2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order2.setMaximumSize(new java.awt.Dimension(150, 150));
        order2.setMinimumSize(new java.awt.Dimension(150, 150));
        order2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order2ActionPerformed(evt);
            }
        });

        num2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setText("0");

        order3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_peperoni.png"))); // NOI18N
        order3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order3.setMaximumSize(new java.awt.Dimension(150, 150));
        order3.setMinimumSize(new java.awt.Dimension(150, 150));
        order3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order3ActionPerformed(evt);
            }
        });

        num3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setText("0");

        order7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_rsz_1colazero.png"))); // NOI18N
        order7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order7.setMaximumSize(new java.awt.Dimension(150, 150));
        order7.setMinimumSize(new java.awt.Dimension(150, 150));
        order7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order7ActionPerformed(evt);
            }
        });

        num6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num6.setText("0");

        order6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1sprite.png"))); // NOI18N
        order6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order6.setMaximumSize(new java.awt.Dimension(150, 150));
        order6.setMinimumSize(new java.awt.Dimension(150, 150));
        order6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order6ActionPerformed(evt);
            }
        });

        num5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num5.setText("0");
        num5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                num5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        order5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_rsz_cola.png"))); // NOI18N
        order5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order5.setMaximumSize(new java.awt.Dimension(150, 150));
        order5.setMinimumSize(new java.awt.Dimension(150, 150));
        order5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order5ActionPerformed(evt);
            }
        });

        num8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num8.setText("0");

        order10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1vanilla.png"))); // NOI18N
        order10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order10.setMaximumSize(new java.awt.Dimension(150, 150));
        order10.setMinimumSize(new java.awt.Dimension(150, 150));
        order10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order10ActionPerformed(evt);
            }
        });

        order9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1choclate.png"))); // NOI18N
        order9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order9.setMaximumSize(new java.awt.Dimension(150, 150));
        order9.setMinimumSize(new java.awt.Dimension(150, 150));
        order9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order9ActionPerformed(evt);
            }
        });

        num7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num7.setText("0");

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Total :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setText("Address :");

        total.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        total.setText("00");

        address.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton12.setText("ORDER");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address))
                        .addGap(51, 51, 51))
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*CASH ON DELIVERY ONLY*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        order1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1vegtebales.png"))); // NOI18N
        order1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order1.setMaximumSize(new java.awt.Dimension(150, 150));
        order1.setMinimumSize(new java.awt.Dimension(150, 150));
        order1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                order1ComponentAdded(evt);
            }
        });
        order1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order1ActionPerformed(evt);
            }
        });

        order11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1cookies.png"))); // NOI18N
        order11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order11.setMaximumSize(new java.awt.Dimension(150, 150));
        order11.setMinimumSize(new java.awt.Dimension(150, 150));
        order11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order11ActionPerformed(evt);
            }
        });

        num12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num12.setText("0");

        order4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1hampizza.png"))); // NOI18N
        order4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order4.setMaximumSize(new java.awt.Dimension(150, 150));
        order4.setMinimumSize(new java.awt.Dimension(150, 150));
        order4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order4ActionPerformed(evt);
            }
        });

        order8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_1redbull.png"))); // NOI18N
        order8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order8.setMaximumSize(new java.awt.Dimension(150, 150));
        order8.setMinimumSize(new java.awt.Dimension(150, 150));
        order8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order8ActionPerformed(evt);
            }
        });

        num10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num10.setText("0");

        num11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num11.setText("0");

        num9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num9.setText("0");

        order12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orders/rsz_donuts.png"))); // NOI18N
        order12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        order12.setMaximumSize(new java.awt.Dimension(150, 150));
        order12.setMinimumSize(new java.awt.Dimension(150, 150));
        order12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order12ActionPerformed(evt);
            }
        });

        num4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num4.setText("0");

        javax.swing.GroupLayout allLayout = new javax.swing.GroupLayout(all);
        all.setLayout(allLayout);
        allLayout.setHorizontalGroup(
            allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allLayout.createSequentialGroup()
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(allLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(order11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))
                    .addGroup(allLayout.createSequentialGroup()
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allLayout.createSequentialGroup()
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(order3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(allLayout.createSequentialGroup()
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(allLayout.createSequentialGroup()
                                .addComponent(order5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(allLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(allLayout.createSequentialGroup()
                                .addComponent(order7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allLayout.createSequentialGroup()
                                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allLayout.createSequentialGroup()
                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        allLayout.setVerticalGroup(
            allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allLayout.createSequentialGroup()
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(allLayout.createSequentialGroup()
                        .addComponent(order2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(order10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(allLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void order12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order12ActionPerformed
        // btn code
        int i = Integer.valueOf(num12.getText());
        ++i;
        num12.setText(String.valueOf(i));

        addtables(12, "Donuts", i, 24.99);

        cal();
    }//GEN-LAST:event_order12ActionPerformed

    private void order8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order8ActionPerformed
        // btn code
        int i = Integer.valueOf(num8.getText());
        ++i;
        num8.setText(String.valueOf(i));

        addtables(8, "Red Bull", i, 19.99);

        cal();
    }//GEN-LAST:event_order8ActionPerformed

    private void order4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order4ActionPerformed
        // btn code
        int i = Integer.valueOf(num4.getText());
        ++i;
        num4.setText(String.valueOf(i));

        addtables(4, "Ham P", i, 65.99);

        cal();
    }//GEN-LAST:event_order4ActionPerformed

    private void order11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order11ActionPerformed
        // btn code
        int i = Integer.valueOf(num11.getText());
        ++i;
        num11.setText(String.valueOf(i));

        addtables(11, "Cookies", i, 24.99);

        cal();
    }//GEN-LAST:event_order11ActionPerformed

    private void order1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order1ActionPerformed
        // btn code
        int i = Integer.valueOf(num1.getText());
        ++i;
        num1.setText(String.valueOf(i));

        addtables(1, "Vegtebales P", i, 59.99);

        cal();
    }//GEN-LAST:event_order1ActionPerformed

    private void order1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_order1ComponentAdded

    }//GEN-LAST:event_order1ComponentAdded

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // delete some iteam

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();

        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);

        //remove Qty Lable
        System.out.println(r);
        switch (r) {

            case "1":
            num1.setText("0");
            break;

            case "2":
            num2.setText("0");
            break;

            case "3":
            num3.setText("0");
            break;

            case "4":
            num4.setText("0");
            break;

            case "5":
            num5.setText("0");
            break;

            case "6":
            num6.setText("0");

            case "7":
            num7.setText("0");
            break;

            case "8":
            num8.setText("0");
            break;

            case "9":
            num9.setText("0");
            break;

            case "10":
            num10.setText("0");
            break;

            case "11":
            num11.setText("0");
            break;

            case "12":
            num12.setText("0");
            break;

            default:
            System.out.println("over");
        }

        cal(); // after iteam delete calculate total
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        JOptionPane.showMessageDialog(null,"Your order have been confirmed!");
        // bill print

        try {

            b.setText("                     Fresh: Pizza Delivery & More \n");
            b.setText(b.getText() + "                     OOP Project, \n");
            b.setText(b.getText() + "                     Nisantasi University, \n");
            b.setText(b.getText() + "----------------------------------------------------------------------------\n");
            b.setText(b.getText() + "  Item \t\tQty \tPrice" +"\n");
            b.setText(b.getText() + "----------------------------------------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();

            // get table Product details

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();

                b.setText(b.getText() +"  "+ Name+"\t\t"+Qty +"\t"+Price + "\n");
            }

            b.setText(b.getText() + "----------------------------------------------------------------------------\n");
            b.setText(b.getText() + "Sub Total : " + total.getText() +"\n");
            b.setText(b.getText() + "Address : " + address.getText() +"\n");
            b.setText(b.getText() + "----------------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Thanks For Your Order...!"+"\n");
            b.setText(b.getText() + "----------------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Project done by: Motasim Abuhalima"+"\n");
            b.setText(b.getText() + "                     Student ID: 20212022107"+"\n");
            

            b.print(); //print

        } catch (Exception e) {

            System.out.println(e);

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void order9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order9ActionPerformed
        // btn code
        int i = Integer.valueOf(num9.getText());
        ++i;
        num9.setText(String.valueOf(i));

        addtables(9, "Chocolate", i, 19.99);

        cal();
    }//GEN-LAST:event_order9ActionPerformed

    private void order10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order10ActionPerformed
        // btn code
        int i = Integer.valueOf(num10.getText());
        ++i;
        num10.setText(String.valueOf(i));

        addtables(10, "Vanilla", i, 19.99);

        cal();
    }//GEN-LAST:event_order10ActionPerformed

    private void order5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order5ActionPerformed
        // btn code
        int i = Integer.valueOf(num5.getText());
        ++i;
        num5.setText(String.valueOf(i));

        addtables(5, "Coca Cola", i, 14.99);

        cal();
    }//GEN-LAST:event_order5ActionPerformed

    private void num5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_num5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_num5AncestorAdded

    private void order6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order6ActionPerformed
        // btn code
        int i = Integer.valueOf(num6.getText());
        ++i;
        num6.setText(String.valueOf(i));

        addtables(6, "Sprite", i, 14.99);

        cal();
    }//GEN-LAST:event_order6ActionPerformed

    private void order7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order7ActionPerformed
        // btn code
        int i = Integer.valueOf(num7.getText());
        ++i;
        num7.setText(String.valueOf(i));

        addtables(7, "Cola Zero", i, 14.99);

        cal();
    }//GEN-LAST:event_order7ActionPerformed

    private void order3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order3ActionPerformed
        // btn code
        int i = Integer.valueOf(num3.getText());
        ++i;
        num3.setText(String.valueOf(i));

        addtables(3, "Pepperoni P", i, 79.99);

        cal();
    }//GEN-LAST:event_order3ActionPerformed

    private void order2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order2ActionPerformed
        // btn code
        int i = Integer.valueOf(num2.getText());
        ++i;
        num2.setText(String.valueOf(i));

        addtables(2, "Cheese P", i, 59.99);

        cal();
    }//GEN-LAST:event_order2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderingFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderingFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderingFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderingFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderingFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JPanel all;
    private javax.swing.JTextArea b;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num10;
    private javax.swing.JLabel num11;
    private javax.swing.JLabel num12;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel num6;
    private javax.swing.JLabel num7;
    private javax.swing.JLabel num8;
    private javax.swing.JLabel num9;
    private javax.swing.JButton order1;
    private javax.swing.JButton order10;
    private javax.swing.JButton order11;
    private javax.swing.JButton order12;
    private javax.swing.JButton order2;
    private javax.swing.JButton order3;
    private javax.swing.JButton order4;
    private javax.swing.JButton order5;
    private javax.swing.JButton order6;
    private javax.swing.JButton order7;
    private javax.swing.JButton order8;
    private javax.swing.JButton order9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
