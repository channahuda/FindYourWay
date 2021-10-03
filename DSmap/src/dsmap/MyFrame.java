package dsmap;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MyFrame extends javax.swing.JFrame {

    ArrayList<Integer> Xpoints = new ArrayList<Integer>();
    ArrayList<Integer> Ypoints = new ArrayList<Integer>();
    int points;
    int[] myArrayx;
    int[] myArrayy;
    ArrayList<Integer> Xpointsall = new ArrayList<Integer>();
    ArrayList<Integer> Ypointsall = new ArrayList<Integer>();
    int pointsall;
    int[] myArrayxall;
    int[] myArrayyall;
    graph g;
    String ourText1;
    String transport = "CAR";
    int weight;
    int shortesttime;
    double shortestdistance;

    public MyFrame() {
        initComponents();
        transportation.setText(transport);
    }

    public int time(String type, double distance) {
        String s = type.toLowerCase();
        double t = 0;
        if (s.equals("car")) {
            //at an average speed of 50km/hr  
            t = (distance / 50) * 60;
        } else if (s.equals("bicycle")) {
            //at an average speed of 30km/hr
            t = (distance / 15) * 60;
        } else if (s.equals("walk")) {
            t = (distance / 5) * 60;
        }
        return (int) t;
    }

    public void displaysteps(double distance) {
        int steps = (int) distance * 1400;
        String x = "";
        int i = 0;
        while (i < steps) {
            x = String.valueOf(i);
            stepsdisplay.setText(x);
            i++;
        }
    }

    public double getcals(int time, int weight, String type) {
        double c = 0;
        if (type.equals("walk")) {
            c = (time * (3.5 * 3.5 * weight)) / 200;
        } else if (type.equals("bicycle")) {
            c = (time * (3.5 * 6.8 * weight)) / 200;
        }
        return c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LeafLink = new javax.swing.JRadioButton();
        MalibuClub = new javax.swing.JRadioButton();
        PoliceStation = new javax.swing.JRadioButton();
        Hardware1 = new javax.swing.JRadioButton();
        PaynSPray1 = new javax.swing.JRadioButton();
        CountryClub = new javax.swing.JRadioButton();
        NorthPointMall = new javax.swing.JRadioButton();
        Hardware2 = new javax.swing.JRadioButton();
        WashingtonMall = new javax.swing.JRadioButton();
        RafaelClothes = new javax.swing.JRadioButton();
        VicePoint = new javax.swing.JRadioButton();
        Pizza = new javax.swing.JRadioButton();
        WashingtonBeach = new javax.swing.JRadioButton();
        Hospital = new javax.swing.JRadioButton();
        Ammunition = new javax.swing.JRadioButton();
        PaynSpray2 = new javax.swing.JRadioButton();
        OceanBayMarina = new javax.swing.JRadioButton();
        HotelHarrison = new javax.swing.JRadioButton();
        OceanView = new javax.swing.JRadioButton();
        map = new javax.swing.JLabel();
        Location = new javax.swing.JComboBox<>();
        Destination = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        FindYourWay = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        shortest = new javax.swing.JTextArea();
        stepsdisplay = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        allroutes = new javax.swing.JTable();
        shortestPathButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calories = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FYW = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        transportation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        LeafLink.setSelected(true);
        LeafLink.setText("jRadioButton1");
        LeafLink.setToolTipText("Leaf Link");
        LeafLink.setContentAreaFilled(false);
        LeafLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeafLinkActionPerformed(evt);
            }
        });
        jPanel1.add(LeafLink);
        LeafLink.setBounds(360, 250, 20, 20);

        MalibuClub.setSelected(true);
        MalibuClub.setToolTipText("Malibu Club");
        MalibuClub.setContentAreaFilled(false);
        jPanel1.add(MalibuClub);
        MalibuClub.setBounds(450, 260, 20, 20);

        PoliceStation.setSelected(true);
        PoliceStation.setText("jRadioButton1");
        PoliceStation.setToolTipText("Police Station");
        PoliceStation.setContentAreaFilled(false);
        PoliceStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceStationActionPerformed(evt);
            }
        });
        jPanel1.add(PoliceStation);
        PoliceStation.setBounds(450, 320, 20, 10);

        Hardware1.setSelected(true);
        Hardware1.setText("jRadioButton1");
        Hardware1.setToolTipText("Hardware 1");
        Hardware1.setContentAreaFilled(false);
        Hardware1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hardware1ActionPerformed(evt);
            }
        });
        jPanel1.add(Hardware1);
        Hardware1.setBounds(430, 170, 20, 20);

        PaynSPray1.setSelected(true);
        PaynSPray1.setText("jRadioButton1");
        PaynSPray1.setToolTipText("Pay N Spray 1");
        PaynSPray1.setContentAreaFilled(false);
        PaynSPray1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaynSPray1ActionPerformed(evt);
            }
        });
        jPanel1.add(PaynSPray1);
        PaynSPray1.setBounds(430, 220, 20, 10);

        CountryClub.setSelected(true);
        CountryClub.setText("jRadioButton1");
        CountryClub.setToolTipText("Country Club");
        CountryClub.setContentAreaFilled(false);
        CountryClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryClubActionPerformed(evt);
            }
        });
        jPanel1.add(CountryClub);
        CountryClub.setBounds(400, 230, 20, 20);

        NorthPointMall.setSelected(true);
        NorthPointMall.setText("jRadioButton1");
        NorthPointMall.setToolTipText("North Point Mall");
        NorthPointMall.setContentAreaFilled(false);
        NorthPointMall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorthPointMallActionPerformed(evt);
            }
        });
        jPanel1.add(NorthPointMall);
        NorthPointMall.setBounds(460, 150, 20, 12);

        Hardware2.setSelected(true);
        Hardware2.setText("jRadioButton1");
        Hardware2.setToolTipText("Hardware 2");
        Hardware2.setContentAreaFilled(false);
        Hardware2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hardware2ActionPerformed(evt);
            }
        });
        jPanel1.add(Hardware2);
        Hardware2.setBounds(410, 380, 20, 10);

        WashingtonMall.setSelected(true);
        WashingtonMall.setText("jRadioButton1");
        WashingtonMall.setToolTipText("Washington Mall");
        WashingtonMall.setContentAreaFilled(false);
        WashingtonMall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WashingtonMallActionPerformed(evt);
            }
        });
        jPanel1.add(WashingtonMall);
        WashingtonMall.setBounds(370, 470, 20, 20);

        RafaelClothes.setSelected(true);
        RafaelClothes.setText("jRadioButton1");
        RafaelClothes.setToolTipText("Rafael's Clothing store");
        RafaelClothes.setContentAreaFilled(false);
        RafaelClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RafaelClothesActionPerformed(evt);
            }
        });
        jPanel1.add(RafaelClothes);
        RafaelClothes.setBounds(440, 420, 20, 10);

        VicePoint.setSelected(true);
        VicePoint.setText("jRadioButton1");
        VicePoint.setToolTipText("Vice Point");
        VicePoint.setContentAreaFilled(false);
        VicePoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VicePointActionPerformed(evt);
            }
        });
        jPanel1.add(VicePoint);
        VicePoint.setBounds(440, 360, 20, 10);

        Pizza.setSelected(true);
        Pizza.setText("jRadioButton1");
        Pizza.setToolTipText("Pizza");
        Pizza.setContentAreaFilled(false);
        Pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PizzaActionPerformed(evt);
            }
        });
        jPanel1.add(Pizza);
        Pizza.setBounds(460, 240, 20, 10);

        WashingtonBeach.setSelected(true);
        WashingtonBeach.setText("jRadioButton1");
        WashingtonBeach.setToolTipText("Washington Beach");
        WashingtonBeach.setContentAreaFilled(false);
        WashingtonBeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WashingtonBeachActionPerformed(evt);
            }
        });
        jPanel1.add(WashingtonBeach);
        WashingtonBeach.setBounds(420, 460, 20, 20);

        Hospital.setSelected(true);
        Hospital.setText("jRadioButton1");
        Hospital.setToolTipText("Hospital");
        Hospital.setContentAreaFilled(false);
        Hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalActionPerformed(evt);
            }
        });
        jPanel1.add(Hospital);
        Hospital.setBounds(340, 450, 20, 20);

        Ammunition.setSelected(true);
        Ammunition.setText("jRadioButton1");
        Ammunition.setToolTipText("Ammunition");
        Ammunition.setContentAreaFilled(false);
        Ammunition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmmunitionActionPerformed(evt);
            }
        });
        jPanel1.add(Ammunition);
        Ammunition.setBounds(320, 510, 20, 20);

        PaynSpray2.setSelected(true);
        PaynSpray2.setText("jRadioButton1");
        PaynSpray2.setToolTipText("Pay N Spray 2");
        PaynSpray2.setContentAreaFilled(false);
        PaynSpray2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaynSpray2ActionPerformed(evt);
            }
        });
        jPanel1.add(PaynSpray2);
        PaynSpray2.setBounds(380, 510, 20, 20);

        OceanBayMarina.setSelected(true);
        OceanBayMarina.setText("jRadioButton1");
        OceanBayMarina.setToolTipText("Ocean Bay Marina");
        OceanBayMarina.setContentAreaFilled(false);
        OceanBayMarina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OceanBayMarinaActionPerformed(evt);
            }
        });
        jPanel1.add(OceanBayMarina);
        OceanBayMarina.setBounds(350, 570, 20, 20);

        HotelHarrison.setSelected(true);
        HotelHarrison.setText("jRadioButton1");
        HotelHarrison.setToolTipText("Hotel Harrison");
        HotelHarrison.setContentAreaFilled(false);
        HotelHarrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelHarrisonActionPerformed(evt);
            }
        });
        jPanel1.add(HotelHarrison);
        HotelHarrison.setBounds(410, 410, 20, 20);

        OceanView.setSelected(true);
        OceanView.setText("jRadioButton1");
        OceanView.setToolTipText("Ocean View");
        OceanView.setContentAreaFilled(false);
        OceanView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OceanViewActionPerformed(evt);
            }
        });
        jPanel1.add(OceanView);
        OceanView.setBounds(450, 390, 20, 20);

        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsmap/FullMap.jpeg"))); // NOI18N
        map.setText("jLabel1");
        jPanel1.add(map);
        map.setBounds(0, 0, 570, 620);

        Location.setBackground(new java.awt.Color(255, 153, 153));
        Location.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Location.setForeground(new java.awt.Color(51, 51, 51));
        Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ammunition", "Country Club", "Hardware Store 1", "Hardware Shop 2", "Hospital", "Hotel Harrison", "Leaf Links", "Malibu Club", "North Point Mall", "Ocean Bay Marina", "Ocean View", "Pay 'n' Spray 1", "Pay 'n' Spray 2", "Pizza", "Police Station", "Rafaels", "Vice Point", "Washington Beach", "Washington Mall" }));
        Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationActionPerformed(evt);
            }
        });
        jPanel1.add(Location);
        Location.setBounds(620, 140, 150, 30);

        Destination.setBackground(new java.awt.Color(204, 255, 153));
        Destination.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Destination.setForeground(new java.awt.Color(51, 51, 51));
        Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ammunition", "Country Club", "Hardware Store 1", "Hardware Shop 2", "Hospital", "Hotel Harrison", "Leaf Links", "Malibu Club", "North Point Mall", "Ocean Bay Marina", "Ocean View", "Pay 'n' Spray 1", "Pay 'n' Spray 2", "Pizza", "Police Station", "Rafaels", "Vice Point", "Washington Beach", "Washington Mall" }));
        Destination.setBorder(null);
        Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationActionPerformed(evt);
            }
        });
        jPanel1.add(Destination);
        Destination.setBounds(820, 140, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Enter Your Location and Destination");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 100, 250, 30);

        FindYourWay.setBackground(new java.awt.Color(255, 255, 255));
        FindYourWay.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        FindYourWay.setForeground(new java.awt.Color(51, 51, 51));
        FindYourWay.setText("Find Your Way");
        FindYourWay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindYourWayMouseClicked(evt);
            }
        });
        FindYourWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindYourWayActionPerformed(evt);
            }
        });
        jPanel1.add(FindYourWay);
        FindYourWay.setBounds(730, 180, 150, 23);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        shortest.setEditable(false);
        shortest.setBackground(new java.awt.Color(217, 192, 220));
        shortest.setColumns(20);
        shortest.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        shortest.setRows(5);
        shortest.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(231, 199, 199)));
        jScrollPane2.setViewportView(shortest);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(830, 420, 250, 100);

        stepsdisplay.setEditable(false);
        stepsdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepsdisplayActionPerformed(evt);
            }
        });
        jPanel1.add(stepsdisplay);
        stepsdisplay.setBounds(580, 420, 70, 30);

        allroutes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(217, 192, 220)));
        allroutes.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        allroutes.setForeground(new java.awt.Color(52, 52, 65));
        allroutes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Routes", "Distance", "time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allroutes.setCellSelectionEnabled(true);
        allroutes.setGridColor(new java.awt.Color(255, 102, 102));
        allroutes.setSelectionBackground(new java.awt.Color(187, 156, 207));
        allroutes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allroutesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(allroutes);
        allroutes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(580, 220, 500, 190);

        shortestPathButton.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        shortestPathButton.setForeground(new java.awt.Color(51, 51, 51));
        shortestPathButton.setText("Shortest Path");
        shortestPathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortestPathButtonActionPerformed(evt);
            }
        });
        jPanel1.add(shortestPathButton);
        shortestPathButton.setBounds(880, 530, 130, 23);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("STEPS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 460, 50, 18);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("For Walk only");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(580, 480, 80, 15);

        calories.setEditable(false);
        calories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesActionPerformed(evt);
            }
        });
        jPanel1.add(calories);
        calories.setBounds(580, 550, 70, 30);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Calories");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(580, 580, 70, 18);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("For Cycle and Walk");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(580, 600, 130, 15);

        FYW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsmap/FYW.jpg"))); // NOI18N
        FYW.setText("Steps");
        FYW.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(FYW);
        FYW.setBounds(560, 350, 620, 280);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsmap/carpic.jpg"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(800, 20, 100, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsmap/cycles.jpg"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(900, 10, 100, 90);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsmap/walkpic.jpg"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(990, 10, 80, 90);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Choose your mode of transport");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(580, 10, 210, 40);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(610, 470, 34, 14);

        jButton4.setText("jButton4");
        jPanel1.add(jButton4);
        jButton4.setBounds(700, 570, 73, 23);

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(620, 470, 59, 20);

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(630, 470, 59, 20);

        transportation.setEditable(false);
        transportation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportationActionPerformed(evt);
            }
        });
        jPanel1.add(transportation);
        transportation.setBounds(650, 60, 70, 30);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Default is CAR");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(640, 40, 90, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeafLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeafLinkActionPerformed
        LeafLink.setSelected(true);
    }//GEN-LAST:event_LeafLinkActionPerformed

    private void PoliceStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceStationActionPerformed
        PoliceStation.setSelected(true);
    }//GEN-LAST:event_PoliceStationActionPerformed

    private void Hardware1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hardware1ActionPerformed
        Hardware1.setSelected(true);
    }//GEN-LAST:event_Hardware1ActionPerformed

    private void PaynSPray1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaynSPray1ActionPerformed
        PaynSPray1.setSelected(true);
    }//GEN-LAST:event_PaynSPray1ActionPerformed

    private void CountryClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryClubActionPerformed
        CountryClub.setSelected(true);
    }//GEN-LAST:event_CountryClubActionPerformed

    private void NorthPointMallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorthPointMallActionPerformed
        NorthPointMall.setSelected(true);
    }//GEN-LAST:event_NorthPointMallActionPerformed

    private void Hardware2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hardware2ActionPerformed
        Hardware2.setSelected(true);
    }//GEN-LAST:event_Hardware2ActionPerformed

    private void WashingtonMallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WashingtonMallActionPerformed
        WashingtonMall.setSelected(true);
    }//GEN-LAST:event_WashingtonMallActionPerformed

    private void RafaelClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RafaelClothesActionPerformed
        RafaelClothes.setSelected(true);
    }//GEN-LAST:event_RafaelClothesActionPerformed

    private void VicePointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VicePointActionPerformed
        VicePoint.setSelected(true);
    }//GEN-LAST:event_VicePointActionPerformed

    private void PizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PizzaActionPerformed
        Pizza.setSelected(true);
    }//GEN-LAST:event_PizzaActionPerformed

    private void WashingtonBeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WashingtonBeachActionPerformed
        WashingtonBeach.setSelected(true);
    }//GEN-LAST:event_WashingtonBeachActionPerformed

    private void HospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalActionPerformed
        Hospital.setSelected(true);
    }//GEN-LAST:event_HospitalActionPerformed

    private void AmmunitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmmunitionActionPerformed
        Ammunition.setSelected(true);
    }//GEN-LAST:event_AmmunitionActionPerformed

    private void PaynSpray2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaynSpray2ActionPerformed
        PaynSpray2.setSelected(true);
    }//GEN-LAST:event_PaynSpray2ActionPerformed

    private void OceanBayMarinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OceanBayMarinaActionPerformed
        OceanBayMarina.setSelected(true);
    }//GEN-LAST:event_OceanBayMarinaActionPerformed

    private void HotelHarrisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelHarrisonActionPerformed
        HotelHarrison.setSelected(true);
    }//GEN-LAST:event_HotelHarrisonActionPerformed

    private void OceanViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OceanViewActionPerformed
        OceanView.setSelected(true);
    }//GEN-LAST:event_OceanViewActionPerformed

    private void DestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationActionPerformed

    }//GEN-LAST:event_DestinationActionPerformed

    private void FindYourWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindYourWayActionPerformed
        Xpointsall.clear();
        Ypointsall.clear();
        pointsall = 0;
        Xpoints.clear();
        Ypoints.clear();
        points = 0;
        calories.setText("");
        stepsdisplay.setText("");
        DefaultTableModel model = (DefaultTableModel) allroutes.getModel();
        model.setRowCount(0);
        Object[] rowdata = new Object[3];
        String start = Location.getSelectedItem().toString();
        String end = Destination.getSelectedItem().toString();
        fileRead1 f = new fileRead1();
        f.read();
        ourText1 = "";
        rowdata[0] = null;
        int time;
        vertex1[] adjList = graph.getadjList();
        ArrayList<linkedList1> path = f.g.allPaths(start, end);
        double distance = 0;
        for (int i = 0; i < path.size(); i++) {
            String ourText = "";
            if (i == graph.getShortestP()) {
                continue;
            }
            node temp = path.get(i).head;
            while (temp != null) {
                ourText += (adjList[temp.v].getName());
                if (temp.next != null) {
                    ourText += " to ";
                }
                temp = temp.next;
            }
            rowdata[0] = ourText;
            String str = path.get(i).distance + "  ";
            str = str.substring(0, 5);
            rowdata[1] = str;
            time = time(transport, path.get(i).distance);
            rowdata[2] = time;
            model.addRow(rowdata);
        }
        node temp2 = path.get(graph.getShortestP()).head;
        ourText1 += ("Shortest path is: ");
        ourText1 += ("\n");
        ourText1 += ("\n");
        while (temp2 != null) {
            ourText1 += (adjList[temp2.v].getName());
            if (temp2.next != null) {
                ourText1 += " to ";
            }
            ourText1 += "\n";
            temp2 = temp2.next;
        }
        time = time(transport, graph.getminD());
        shortesttime = time;
        shortestdistance = graph.getminD();
        String str = graph.getminD() + "  ";
        str = str.substring(0, 5);
        ourText1 += ("\n" + "\n" + "Shortest Distance: " + str + "km" + "\n" + time + "minutes" + "\n");
        shortest.setText(ourText1);
        //NOW DRAWING LINES ON MAP
        node temp3 = path.get(graph.getShortestP()).head;
        while (temp3 != null) {
            String from = adjList[temp3.v].getName();
            points++;
            DrawingRoute(from);
            temp3 = temp3.next;
        }
        myArrayx = new int[Xpoints.size()];
        myArrayy = new int[Ypoints.size()];
        for (int i = 0; i < myArrayx.length; i++) {   //Converting ArrayList into int Array
            myArrayx[i] = Xpoints.get(i);
        }
        for (int i = 0; i < myArrayy.length; i++) {
            myArrayy[i] = Ypoints.get(i);
        }
        if (transport.equals("walk") || transport.equals("bicycle")) {
            double c = (shortesttime * 3.5 * 3.5 * weight / 200);
            calories.setText(Double.toString(c));
        }
        if (transport.equals("walk")) {
            displaysteps(shortestdistance);
        }
        repaint();
    }//GEN-LAST:event_FindYourWayActionPerformed

    private void LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationActionPerformed

    private void stepsdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepsdisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stepsdisplayActionPerformed

    private void FindYourWayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindYourWayMouseClicked

    }//GEN-LAST:event_FindYourWayMouseClicked

    private void allroutesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allroutesMouseClicked
        Xpointsall.clear();
        Ypointsall.clear();
        pointsall = 0;
        int column = 0;
        int row = allroutes.getSelectedRow();
        if (transport.equals("walk")) {
            displaysteps(Double.valueOf(allroutes.getValueAt(row, 1).toString()));
        }
        if (transport.equals("walk") || transport.equals("bicycle")) {
            double c = (Integer.valueOf(allroutes.getValueAt(row, 2).toString()) * 3.5 * 3.5 * Double.valueOf(weight) / 200);
            calories.setText(Double.toString(c));
        }
        String value = allroutes.getModel().getValueAt(row, column).toString();
        String[] s = value.split(" to ");
        value = "";
        for (int i = 0; i < s.length; i++) {
            value += s[i] + "\n";
            DrawingRoutes(s[i]);
            pointsall++;
        }
        String str = "Distance " + allroutes.getModel().getValueAt(row, column + 1).toString() + "km";
        str += "  Time " + allroutes.getModel().getValueAt(row, column + 2).toString() + "minutes";
        String overall = value + "\n" + str;
        shortest.setText(overall);
        myArrayxall = new int[Xpointsall.size()];
        myArrayyall = new int[Ypointsall.size()];
        for (int i = 0; i < myArrayxall.length; i++) {   //Converting ArrayList into int Array
            myArrayxall[i] = Xpointsall.get(i);
        }
        for (int i = 0; i < myArrayyall.length; i++) {
            myArrayyall[i] = Ypointsall.get(i);
        }
        repaint();
    }//GEN-LAST:event_allroutesMouseClicked

    private void shortestPathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortestPathButtonActionPerformed
        shortest.setText(ourText1);
        if (transport.equals("walk")) {
            displaysteps(shortestdistance);
        }
        if (transport.equals("walk") || transport.equals("bicycle")) {
            double c = (shortesttime * 3.5 * 3.5 * weight / 200);
            calories.setText(Double.toString(c));
        }
        int timerDelay = 50;
        new Timer(timerDelay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        }).start();
        Xpointsall.clear();
        Ypointsall.clear();
        pointsall = 0;
    }//GEN-LAST:event_shortestPathButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        transport = "car";
        transportation.setText("CAR");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        transport = "bicycle";
        transportation.setText("BICYCLE");
        int response = JOptionPane.showConfirmDialog(this, "Would you like to calculate your calories?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            weight = Integer.valueOf(JOptionPane.showInputDialog("What is your weight?"));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        transport = "walk";
        transportation.setText("WALK");
        int response = JOptionPane.showConfirmDialog(this, "Would you like to calculate your calories?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            weight = Integer.valueOf(JOptionPane.showInputDialog("What is your weight?"));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void transportationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportationActionPerformed

    private void caloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caloriesActionPerformed
    public int xcord(javax.swing.JRadioButton button) {
        return button.getBounds().x;
    }

    public int ycord(javax.swing.JRadioButton button) {
        return button.getBounds().y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (Xpoints != null && myArrayx != null) {
            g.setColor(Color.RED);
            ((Graphics2D) g).setStroke(new BasicStroke(4));
            ((Graphics2D) g).drawPolyline(myArrayx, myArrayy, points);
        }
        if (Xpointsall != null && myArrayxall != null) {
            g.setColor(Color.BLACK);
            ((Graphics2D) g).setStroke(new BasicStroke(3));
            ((Graphics2D) g).drawPolyline(myArrayxall, myArrayyall, pointsall);
        }
        setIgnoreRepaint(true);
    }

    private void DrawingRoute(String from) {
        if ("Ammunition".equals(from)) {
            Xpoints.add(xcord(Ammunition) + 10);
            Ypoints.add(ycord(Ammunition) + 29);
        } else if ("Country Club".equals(from)) {
            Xpoints.add(xcord(CountryClub) + 10);
            Ypoints.add(ycord(CountryClub) + 27);
        } else if ("Hardware Store 1".equals(from)) {
            Xpoints.add(xcord(Hardware1) + 10);
            Ypoints.add(ycord(Hardware1) + 27);
        } else if ("Hardware Shop 2".equals(from)) {
            Xpoints.add(xcord(Hardware2) + 10);
            Ypoints.add(ycord(Hardware2) + 27);
        } else if ("Hospital".equals(from)) {
            Xpoints.add(xcord(Hospital) + 10);
            Ypoints.add(ycord(Hospital) + 27);
        } else if ("Hotel Harrison".equals(from)) {
            Xpoints.add(xcord(HotelHarrison) + 10);
            Ypoints.add(ycord(HotelHarrison) + 27);
        } else if ("Leaf Links".equals(from)) {
            Xpoints.add(xcord(LeafLink) + 10);
            Ypoints.add(ycord(LeafLink) + 27);
        } else if ("Malibu Club".equals(from)) {
            Xpoints.add(xcord(MalibuClub) + 10);
            Ypoints.add(ycord(MalibuClub) + 27);
        } else if ("North Point Mall".equals(from)) {
            Xpoints.add(xcord(NorthPointMall) + 10);
            Ypoints.add(ycord(NorthPointMall) + 27);
        } else if ("Ocean Bay Marina".equals(from)) {
            Xpoints.add(xcord(OceanBayMarina) + 10);
            Ypoints.add(ycord(OceanBayMarina) + 27);
        } else if ("Ocean View".equals(from)) {
            Xpoints.add(xcord(OceanView) + 10);
            Ypoints.add(ycord(OceanView) + 27);
        } else if ("Pay 'n' Spray 1".equals(from)) {
            Xpoints.add(xcord(PaynSPray1) + 10);
            Ypoints.add(ycord(PaynSPray1) + 27);
        } else if ("Pay 'n' Spray 2".equals(from)) {
            Xpoints.add(xcord(PaynSpray2) + 10);
            Ypoints.add(ycord(PaynSpray2) + 27);
        } else if ("Pizza".equals(from)) {
            Xpoints.add(xcord(Pizza) + 10);
            Ypoints.add(ycord(Pizza) + 27);
        } else if ("Police Station".equals(from)) {
            Xpoints.add(xcord(PoliceStation) + 10);
            Ypoints.add(ycord(PoliceStation) + 27);
        } else if ("Rafaels".equals(from)) {
            Xpoints.add(xcord(RafaelClothes) + 10);
            Ypoints.add(ycord(RafaelClothes) + 27);
        } else if ("Vice Point".equals(from)) {
            Xpoints.add(xcord(VicePoint) + 10);
            Ypoints.add(ycord(VicePoint) + 27);
        } else if ("Washington Beach".equals(from)) {
            Xpoints.add(xcord(WashingtonBeach) + 10);
            Ypoints.add(ycord(WashingtonBeach) + 27);
        } else if ("Washington Mall".equals(from)) {
            Xpoints.add(xcord(WashingtonMall) + 10);
            Ypoints.add(ycord(WashingtonMall) + 27);
        }
    }

    private void DrawingRoutes(String from) {
        if ("Ammunition".equals(from)) {
            Xpointsall.add(xcord(Ammunition) + 12);
            Ypointsall.add(ycord(Ammunition) + 30);
        } else if ("Country Club".equals(from)) {
            Xpointsall.add(xcord(CountryClub) + 12);
            Ypointsall.add(ycord(CountryClub) + 30);
        } else if ("Hardware Store 1".equals(from)) {
            Xpointsall.add(xcord(Hardware1) + 12);
            Ypointsall.add(ycord(Hardware1) + 30);
        } else if ("Hardware Shop 2".equals(from)) {
            Xpointsall.add(xcord(Hardware2) + 12);
            Ypointsall.add(ycord(Hardware2) + 30);
        } else if ("Hospital".equals(from)) {
            Xpointsall.add(xcord(Hospital) + 12);
            Ypointsall.add(ycord(Hospital) + 30);
        } else if ("Hotel Harrison".equals(from)) {
            Xpointsall.add(xcord(HotelHarrison) + 12);
            Ypointsall.add(ycord(HotelHarrison) + 30);
        } else if ("Leaf Links".equals(from)) {
            Xpointsall.add(xcord(LeafLink) + 12);
            Ypointsall.add(ycord(LeafLink) + 30);
        } else if ("Malibu Club".equals(from)) {
            Xpointsall.add(xcord(MalibuClub) + 12);
            Ypointsall.add(ycord(MalibuClub) + 30);
        } else if ("North Point Mall".equals(from)) {
            Xpointsall.add(xcord(NorthPointMall) + 12);
            Ypointsall.add(ycord(NorthPointMall) + 30);
        } else if ("Ocean Bay Marina".equals(from)) {
            Xpointsall.add(xcord(OceanBayMarina) + 12);
            Ypointsall.add(ycord(OceanBayMarina) + 30);
        } else if ("Ocean View".equals(from)) {
            Xpointsall.add(xcord(OceanView) + 12);
            Ypointsall.add(ycord(OceanView) + 30);
        } else if ("Pay 'n' Spray 1".equals(from)) {
            Xpointsall.add(xcord(PaynSPray1) + 12);
            Ypointsall.add(ycord(PaynSPray1) + 30);
        } else if ("Pay 'n' Spray 2".equals(from)) {
            Xpointsall.add(xcord(PaynSpray2) + 12);
            Ypointsall.add(ycord(PaynSpray2) + 30);
        } else if ("Pizza".equals(from)) {
            Xpointsall.add(xcord(Pizza) + 12);
            Ypointsall.add(ycord(Pizza) + 30);
        } else if ("Police Station".equals(from)) {
            Xpointsall.add(xcord(PoliceStation) + 12);
            Ypointsall.add(ycord(PoliceStation) + 30);
        } else if ("Rafaels".equals(from)) {
            Xpointsall.add(xcord(RafaelClothes) + 12);
            Ypointsall.add(ycord(RafaelClothes) + 30);
        } else if ("Vice Point".equals(from)) {
            Xpointsall.add(xcord(VicePoint) + 12);
            Ypointsall.add(ycord(VicePoint) + 30);
        } else if ("Washington Beach".equals(from)) {
            Xpointsall.add(xcord(WashingtonBeach) + 12);
            Ypointsall.add(ycord(WashingtonBeach) + 30);
        } else if ("Washington Mall".equals(from)) {
            Xpointsall.add(xcord(WashingtonMall) + 12);
            Ypointsall.add(ycord(WashingtonMall) + 30);
        }
    }

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ammunition;
    private javax.swing.JRadioButton CountryClub;
    private javax.swing.JComboBox<String> Destination;
    private javax.swing.JLabel FYW;
    private javax.swing.JButton FindYourWay;
    private javax.swing.JRadioButton Hardware1;
    private javax.swing.JRadioButton Hardware2;
    private javax.swing.JRadioButton Hospital;
    private javax.swing.JRadioButton HotelHarrison;
    private javax.swing.JRadioButton LeafLink;
    private javax.swing.JComboBox<String> Location;
    private javax.swing.JRadioButton MalibuClub;
    private javax.swing.JRadioButton NorthPointMall;
    private javax.swing.JRadioButton OceanBayMarina;
    private javax.swing.JRadioButton OceanView;
    private javax.swing.JRadioButton PaynSPray1;
    private javax.swing.JRadioButton PaynSpray2;
    private javax.swing.JRadioButton Pizza;
    private javax.swing.JRadioButton PoliceStation;
    private javax.swing.JRadioButton RafaelClothes;
    private javax.swing.JRadioButton VicePoint;
    private javax.swing.JRadioButton WashingtonBeach;
    private javax.swing.JRadioButton WashingtonMall;
    private javax.swing.JTable allroutes;
    private javax.swing.JTextField calories;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel map;
    private javax.swing.JTextArea shortest;
    private javax.swing.JButton shortestPathButton;
    private javax.swing.JTextField stepsdisplay;
    private javax.swing.JTextField transportation;
    // End of variables declaration//GEN-END:variables

}
