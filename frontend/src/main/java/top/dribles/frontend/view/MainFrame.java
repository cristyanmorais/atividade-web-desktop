/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package top.dribles.frontend.view;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author crist
 */
public class MainFrame extends javax.swing.JFrame {
    
    private static CardLayout cardLayout;
    private static JPanel mainPanel;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        // Configurar o título do JFrame
        super("Sua Aplicação");

        // Definir o comportamento padrão ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar o CardLayout e o painel principal
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Criar as instâncias dos painéis
        Menu menu = new Menu();
        Clientes clientes = new Clientes();
        Produtos produtos = new Produtos();
        Vendas vendas = new Vendas();

        // Adicionar os painéis ao CardLayout
        mainPanel.add(menu, "menuPanel");
        mainPanel.add(clientes, "clientesPanel");
        mainPanel.add(produtos, "produtosPanel");
        mainPanel.add(vendas, "vendasPanel");

        // Adicionar o painel principal ao JFrame
        add(mainPanel);

        // Ajustar o tamanho do JFrame
        pack();
        
        setLocationRelativeTo(null);

        // Tornar o JFrame visível
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1136, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public static void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }
    
    public static void main(String args[]) {
        new MainFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
