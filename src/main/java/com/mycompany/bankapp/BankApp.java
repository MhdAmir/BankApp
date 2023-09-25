/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankapp;

import com.mycompany.bankapp.entity.*;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import com.mycompany.bankapp.view.AdminView;
import com.mycompany.bankapp.view.HomeView;
import com.mycompany.bankapp.view.LoginView;
import com.mycompany.bankapp.view.RegisterView;
import com.mycompany.bankapp.view.TopUpView;
import com.mycompany.bankapp.view.WithDrawView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author mamir
 */
public class BankApp {
    private JFrame app;
public Bank bank;
    public int CurrentUser;
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new FlatGradiantoDeepOceanIJTheme());
        }catch (Exception e){
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            BankApp app = new BankApp();
            app.bank.tambahNasabah("Masih", "Pemula", "masih", "pemula");
            app.showLoginView();
        });
    }
    
    public BankApp(){
        this.app = new JFrame("King Bank");
        this.bank = new Bank();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 470);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }
    public void showAdminHomeView() {
        changeView(new AdminView(this));
        app.setSize(750, 430);
    }
    
    public void showLoginView() {
        changeView(new LoginView(this));
        app.setSize(406, 470);
    }
    
    public void showRegisterView() {
        changeView(new RegisterView(this));
        app.setSize(530, 500);
    }
    
    public void showHomeView() {
        changeView(new HomeView(this));
        app.setSize(426, 260);
    }
    
    public void showTopUpView() {
        changeView(new TopUpView(this));
        app.setSize(400, 300);
    }
    
    public void showWithdrawView() {
        changeView(new WithDrawView(this));
        app.setSize(400, 300);
    }
    
    public void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
        app.setLocationRelativeTo(null);
    }
}
