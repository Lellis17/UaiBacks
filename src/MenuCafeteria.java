import javax.swing.*;
import java.awt.*;
public class MenuCafeteria {
    public static void main(String[] args) {

                // Criando uma instância da JFrame

                JFrame frame = new JFrame("UAIBACKS");

                // Configurando o tamanho da janela
                frame.setSize(750, 1125);

                // Configurando o comportamento padrão de fechar a janela
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Criando a barra de menu
                JMenuBar menuBar = new JMenuBar();

                // Criando os menus
                JMenu bebidasMenu = new JMenu("Cafés");
                JMenu comidasMenu = new JMenu("Lanches");
                JMenu acrescimoMenu = new JMenu("Acrescimos");

                // Criando os itens de menu
                JMenuItem cafeItem = new JMenuItem("Café Coado 200ml");
                JMenuItem cafe2Item = new JMenuItem("Café Coado 300ml");
                JMenuItem cafe3Item = new JMenuItem("Café Coado 400ml");
                JMenuItem cafe4Item = new JMenuItem("Cappucino 300ml");
                JMenuItem cafe5Item = new JMenuItem("Cappucino 400ml");
                JMenuItem cafe6Item = new JMenuItem("Cappucino 500ml");
                JMenuItem cafe7Item = new JMenuItem("Frappuccino 300ml");
                JMenuItem cafe8Item = new JMenuItem("Frappuccino 400ml");
                JMenuItem cafe9Item = new JMenuItem("Frappuccino 500ml");
                JMenuItem paodequeijoItem = new JMenuItem("Pao de Queijo");
                JMenuItem boloItem = new JMenuItem("Bolo");
                JMenuItem CookiesItem = new JMenuItem("Cookies");
                JMenuItem MistoQuenteItem = new JMenuItem("Misto Quente");
                JMenuItem acreItem = new JMenuItem("Chantilly");
                JMenuItem acre2Item = new JMenuItem("Nutella");
                JMenuItem acre3Item = new JMenuItem("Crema de latte");
                JMenuItem acre4Item = new JMenuItem("Doce de Leite");


                // Adicionando os itens de menu aos menus correspondentes
                bebidasMenu.add(cafeItem);
                bebidasMenu.add(cafe2Item);
                bebidasMenu.add(cafe3Item);
                bebidasMenu.add(cafe4Item);
                bebidasMenu.add(cafe5Item);
                bebidasMenu.add(cafe6Item);
                bebidasMenu.add(cafe7Item);
                bebidasMenu.add(cafe8Item);
                bebidasMenu.add(cafe9Item);
                comidasMenu.add(paodequeijoItem);
                comidasMenu.add(CookiesItem);
                comidasMenu.add(boloItem);
                comidasMenu.add(MistoQuenteItem);
                acrescimoMenu.add(acreItem);
                acrescimoMenu.add(acre2Item);
                acrescimoMenu.add(acre3Item);
                acrescimoMenu.add(acre3Item);


                // Adicionando os menus à barra de menu
                menuBar.add(bebidasMenu);
                menuBar.add(comidasMenu);
                menuBar.add(acrescimoMenu);

                // Definindo a barra de menu da janela
                frame.setJMenuBar(menuBar);
                //JPanel P = new JPanel();
                //JLabel L = new JLabel();
               // L.setText("UAIBACKS");
               // P.add(L);
               // frame.getContentPane().add(P);


        ImageIcon icon = new ImageIcon("C:/Users/guima/OneDrive/Área de Trabalho/Cafeteria/coffe.jpg");
        JLabel label = new JLabel();
        label.setIcon(icon);
        JFrame frame2 = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);

        // Exibindo a janela
                frame.setVisible(true);


            }
        }





