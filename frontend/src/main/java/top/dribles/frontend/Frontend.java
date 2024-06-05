/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package top.dribles.frontend;

import javax.swing.JFrame;
import top.dribles.frontend.view.Menu;

/**
 *
 * @author crist
 */
public class Frontend {

    public static void main(String[] args) {
        // Criar uma instância do painel ListarCliente
        Menu menu = new Menu();
        
        // Criar um JFrame para exibir o painel
        JFrame frame = new JFrame("Sua Aplicação");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        // Adicionar o painel ao JFrame
        frame.getContentPane().add(menu);
        
        // Configurar o tamanho e tornar visível
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
