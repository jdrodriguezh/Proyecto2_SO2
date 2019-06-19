
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Josue Rodriguez
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() throws RemoteException, NotBoundException {
        initComponents();
        System.out.print("Ingrese un nombre para el cliente: ");
        String nombre = entrada.next();
        cliente = new Com(nombre);
        clientName.setText(nombre);
        /*Registry registry = LocateRegistry.getRegistry(4200);
        server = (ComInterface)registry.lookup("proyecto");
        if(server!=null){
            System.out.println("Conectado");
        }
        server.nuevoCliente();
        arbolCliente.setModel(server.getModel());
        server.setClient(cliente);*/

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identificador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbolCliente = new javax.swing.JTree();
        cargarArchivo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoArchivo = new javax.swing.JTextArea();
        botonMostrarOriginal = new javax.swing.JButton();
        botonGuardado = new javax.swing.JButton();
        clientName = new javax.swing.JTextField();
        botonConectar = new javax.swing.JButton();
        botonDesconectar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cliente");

        identificador.setText("¿Qué soy?");
        identificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificadorActionPerformed(evt);
            }
        });

        arbolCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Archivos en Cache"));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empty");
        arbolCliente.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(arbolCliente);

        cargarArchivo.setText("Abrir");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });

        textoArchivo.setColumns(20);
        textoArchivo.setRows(5);
        textoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Archivo Seleccionado"));
        jScrollPane2.setViewportView(textoArchivo);

        botonMostrarOriginal.setText("Mostrar Original");
        botonMostrarOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarOriginalActionPerformed(evt);
            }
        });

        botonGuardado.setText("Guardar Cambios");
        botonGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardadoActionPerformed(evt);
            }
        });

        clientName.setEditable(false);
        clientName.setText("jTextField1");
        clientName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"));

        botonConectar.setText("Conectar");
        botonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConectarActionPerformed(evt);
            }
        });

        botonDesconectar.setText("Desconectar");
        botonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesconectarActionPerformed(evt);
            }
        });

        jButton1.setText("+ Directorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+ Archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Enviar Cambios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refrescar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("X");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(clientName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botonConectar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonDesconectar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(identificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMostrarOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonGuardado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonConectar)
                            .addComponent(botonDesconectar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargarArchivo)
                    .addComponent(jButton1)
                    .addComponent(botonGuardado)
                    .addComponent(botonMostrarOriginal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificador)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificadorActionPerformed
        System.out.println("Este es el cliente");
    }//GEN-LAST:event_identificadorActionPerformed

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        if (arbolCliente.getSelectionPath() != null) {
            String path = formatPathFromTree(arbolCliente.getSelectionPath().toString());
            //System.out.println(path);
            if (path.endsWith(".txt")) {
                try {
                    String[] route = path.split("/");
                    this.openFile(route, cache, 1);
                    showContents(currentFile);
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("ATENCION: ¡Lo que intenta recuperar es un directorio!");
            }
            /*currentPath = path;
            if (path.endsWith(".txt")) {
                textoArchivo.setText(null);
                System.out.println("Recuperar archivo...");
                try {
                    currentFile = server.requestFile(path);
                    System.out.println("¡Recuperado exitoso!");
                    System.out.println(path);
                    showContents(currentFile);
                } catch (RemoteException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("ATENCION: ¡Lo que intenta recuperar es un directorio!");
            }*/
        } else {
            System.out.println("ATENCION: ¡Seleccione un nodo primero!");
        }
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void botonMostrarOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarOriginalActionPerformed
        System.out.println("Texto Original del Archivo:");
        System.out.println(originalContent);
    }//GEN-LAST:event_botonMostrarOriginalActionPerformed

    private void botonGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardadoActionPerformed
        String content = textoArchivo.getText();
        if (content.equals(originalContent)) {
            System.out.println(">>No se hicieron modificaciones, no es necesario guardar!");
        } else {
            System.out.println(">>Enviando solicitud para guardar...");
            try {
                server.saveFile(content, currentFile);
                System.out.println(">>¡Guardado exitoso!");
            } catch (RemoteException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonGuardadoActionPerformed

    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry(4200);
            server = (ComInterface) registry.lookup("proyecto");
            if (server != null) {
                System.out.println("ESTADO: Conectado");
            }
            //server.nuevoCliente();
            server.setClient(cliente);
            this.cache = server.pull();
            DefaultMutableTreeNode r = new DefaultMutableTreeNode("Root");
            cargarArbol(cache, r);
            this.arbolCliente.setModel(new DefaultTreeModel(r));
            //arbolCliente.setModel(server.getModel());
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonConectarActionPerformed

    private void botonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesconectarActionPerformed
        try {
            server.remove(this.cliente.getName());
            System.out.println("ESTADO: Desconectado");
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonDesconectarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (arbolCliente.getSelectionPath() != null) {
            //System.out.println("toString: " + hols.toString());
            //System.out.println("normal: " + hols);
            System.out.println(arbolCliente.getSelectionPath().toString());
            String path = formatPathFromTree(arbolCliente.getSelectionPath().toString());
            System.out.println(path);
            String[] dirs = path.split("/");
            System.out.print("Ingrese el nombre del nuevo directorio (una palabra): ");
            String dirName = entrada.next();
            DefaultMutableTreeNode r = (DefaultMutableTreeNode) ((DefaultTreeModel) arbolCliente.getModel()).getRoot();
            insertIntoTree(dirs, r, dirName);
            /*currentPath = path;
            if(path.endsWith(".txt")){
                textoArchivo.setText(null);
                System.out.println("Recuperar archivo...");
                try {
                    currentFile = server.requestFile(path);
                    System.out.println("¡Recuperado exitoso!");
                    System.out.println(path);
                    showContents(currentFile);
                } catch (RemoteException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                System.out.println("ATENCION: ¡Lo que intenta recuperar es un directorio!");
            }*/
        } else {
            System.out.println("ATENCION: ¡Seleccione un nodo primero!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (bitModificacion) {
            try {
                server.push(cache);
                server.setCambio(true);
            } catch (RemoteException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println(">>No hay cambios notables en la estructura. No es necesario mandar.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            this.cache = server.pull();
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultMutableTreeNode r = new DefaultMutableTreeNode("Root");
        cargarArbol(cache, r);
        this.arbolCliente.setModel(new DefaultTreeModel(r));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            if (server != null) {
                server.remove(this.cliente.getName());
                System.out.println("ESTADO: Desconectado");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (arbolCliente.getSelectionPath() != null) {
            //System.out.println("toString: " + hols.toString());
            //System.out.println("normal: " + hols);
            System.out.println(arbolCliente.getSelectionPath().toString());
            String path = formatPathFromTree(arbolCliente.getSelectionPath().toString());
            System.out.println(path);
            String[] dirs = path.split("/");
            System.out.print("Ingrese el nombre del nuevo archivo (una palabra): ");
            String dirName = entrada.next();
            dirName = path + "/" + dirName + ".txt";
            DefaultMutableTreeNode r = (DefaultMutableTreeNode) ((DefaultTreeModel) arbolCliente.getModel()).getRoot();
            insertIntoTreeFile(dirs, r, dirName);
            /*currentPath = path;
            if(path.endsWith(".txt")){
                textoArchivo.setText(null);
                System.out.println("Recuperar archivo...");
                try {
                    currentFile = server.requestFile(path);
                    System.out.println("¡Recuperado exitoso!");
                    System.out.println(path);
                    showContents(currentFile);
                } catch (RemoteException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                System.out.println("ATENCION: ¡Lo que intenta recuperar es un directorio!");
            }*/
        } else {
            System.out.println("ATENCION: ¡Seleccione un nodo primero!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arprueguments
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cliente().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NotBoundException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void showContents(File file) throws FileNotFoundException, IOException {
        //System.out.println(file.getPath());
        textoArchivo.setText("");
        originalContent = "";
        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            originalContent += linea;
            originalContent += "\n";
        }
        br.close();
        textoArchivo.setText(originalContent);
    }

    public String formatPathFromTree(String path) {
        String retVal = "";
        path = path.substring(0, path.length() - 1);
        String[] dirs = path.split(",");
        for (int i = 0; i < dirs.length; i++) {
            if (i == dirs.length - 1) {
                retVal += dirs[i].substring(1);
            } else {
                retVal += dirs[i].substring(1) + "/";
            }
        }
        return retVal;
    }

    public void cargarArbol(Directory dir, DefaultMutableTreeNode nodo) {
        for (int i = 0; i < dir.subdirectorios.size(); i++) {
            DefaultMutableTreeNode subDirectory = new DefaultMutableTreeNode(dir.subdirectorios.get(i).dirName);
            cargarArbol(dir.subdirectorios.get(i), subDirectory);
            nodo.add(subDirectory);
        }
        for (int i = 0; i < dir.archivos.size(); i++) {
            nodo.add(new DefaultMutableTreeNode(dir.archivos.get(i).getName()));
        }
    }

    public void insertIntoTree(String[] path, DefaultMutableTreeNode raiz, String dirName) {
        //System.out.println(path.toString());

        if (path.length == 1) {
            DefaultMutableTreeNode r = (DefaultMutableTreeNode)(arbolCliente.getModel()).getRoot();
            r.add(new DefaultMutableTreeNode(dirName));
            this.arbolCliente.setModel(new DefaultTreeModel(r));
            
        } else {
            insert(cache, dirName, path, 1);
            DefaultMutableTreeNode r = new DefaultMutableTreeNode("Root");
            cargarArbol(cache, r);
            this.arbolCliente.setModel(new DefaultTreeModel(r));
        }
    }
    
    public void insert(Directory dirs, String dirName, String[] path, int index) {
        for (int i = 0; i < dirs.subdirectorios.size(); i++) {
            System.out.println(path[index]);
            if (dirs.subdirectorios.get(i).dirName.equals(path[index])) {
                if (index == path.length - 1) {
                    Directory addMe = new Directory();
                    addMe.setName(dirName);
                    dirs.subdirectorios.get(i).subdirectorios.add(addMe);
                    bitModificacion = true;
                } else {
                    int helper = index + 1;
                    insert(dirs.subdirectorios.get(i), dirName, path, helper);
                }
            }
        }
    }
    
    private void insertIntoTreeFile(String[] path, DefaultMutableTreeNode raiz, String dirName) {
        if (path.length == 1) {
//            DefaultMutableTreeNode r = (DefaultMutableTreeNode)(arbolCliente.getModel()).getRoot();
//            File addMe = new File(dirName);
//            cache.archivos.add(addMe);
//            cargarArbol(cache, r);
//            this.arbolCliente.setModel(new DefaultTreeModel(r));
            
        } else {
            insertFile(cache, dirName, path, 1);
            DefaultMutableTreeNode r = new DefaultMutableTreeNode("Root");
            cargarArbol(cache, r);
            this.arbolCliente.setModel(new DefaultTreeModel(r));
        }
            
    }
    
    public void insertFile(Directory dirs, String dirName, String[] path, int index) {
        for (int i = 0; i < dirs.subdirectorios.size(); i++) {
            System.out.println(path[index]);
            if (dirs.subdirectorios.get(i).dirName.equals(path[index])) {
                if (index == path.length - 1) {
                    File addMe = new File(dirName);
                    dirs.subdirectorios.get(i).archivos.add(addMe);
                    try{
                        server.saveFile(" ", addMe);
                        server.setCambio(true);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    bitModificacion = true;
                } else {
                    int helper = index + 1;
                    insert(dirs.subdirectorios.get(i), dirName, path, helper);
                }
            }
        }
    }

    /*public void insert(int index, String[] path, DefaultMutableTreeNode nodo, String dirName){
        System.out.println("index: " + index);
        System.out.println("length: " + path.length);
        Enumeration e = nodo.breadthFirstEnumeration();
        while(e.hasMoreElements()){
            DefaultMutableTreeNode actual = (DefaultMutableTreeNode)e.nextElement();
            if(actual.toString().equals(path[index])){
                if(index == path.length-1){
                    actual.add(new DefaultMutableTreeNode(dirName));
                    bitModificacion = true;
                    return;
                }else{
                    int help = index + 1;
                    System.out.println("help: " + help);
                    insert(help,path,actual,dirName);
                }
            }else{
                
            }
        }
        
    }*/

    public void openFile(String[] path, Directory dir, int index) {
        /*System.out.println("###########################");
        System.out.println("path im searching for: " +path[index]);
        System.out.println("directory im currently at: " + dir.dirName);
        System.out.println("index: " + index);
        System.out.println("###########################");*/
        if (index == path.length - 1) {
            for (int i = 0; i < dir.archivos.size(); i++) {
                if (dir.archivos.get(i).getName().equals(path[index])) {
                    //System.out.println("Encontro algo: " + dir.archivos.get(i).getName());
                    currentFile = dir.archivos.get(i);
                    //System.out.println("Aqui estoy despues de asignar el currentFile");
                    return;
                }
            }
        }
        for (int i = 0; i < dir.subdirectorios.size(); i++) {
            if (dir.subdirectorios.get(i).dirName.equals(path[index])) {
                //System.out.println(">>Encontro algo: " + dir.subdirectorios.get(i).dirName);
                if (index != path.length - 1) {
                    int helper = index + 1;
                    openFile(path, dir.subdirectorios.get(i), helper);
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolCliente;
    private javax.swing.JButton botonConectar;
    private javax.swing.JButton botonDesconectar;
    private javax.swing.JButton botonGuardado;
    private javax.swing.JButton botonMostrarOriginal;
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JTextField clientName;
    private javax.swing.JButton identificador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textoArchivo;
    // End of variables declaration//GEN-END:variables
    ComInterface server;
    ComInterface cliente;
    File currentFile;
    String originalContent = "";
    String currentPath = "";
    Directory cache = new Directory();
    boolean bitModificacion = false;
    Scanner entrada = new Scanner(System.in);

}
