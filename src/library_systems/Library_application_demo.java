package library_systems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library_application_demo  extends JFrame implements ActionListener {

    private library mainlibrary;
    private book  tempbook;
    private JButton add_book_button;
    private JButton display_book_button;
    private JTextField library_textfield;
    private JLabel status;
    private JTextField book_textfield;

    Library_application_demo(){
        display_book_button = new JButton(" Display book");
        add_book_button   = new JButton("Add Book");
        library_textfield = new JTextField();
        status            = new JLabel("You have submitted a book. Add another?");
        book_textfield = new JTextField();


        setTitle("Library System");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        library_textfield.setBounds(30, 50, 200, 30);
        add_book_button.setBounds(300, 50, 120, 30);
        display_book_button.setBounds(300,100,120,30);
        status.setBounds(30, 100, 400, 30);

        add_book_button.addActionListener(this);
        display_book_button.addActionListener(this);

        add(library_textfield);
        add(add_book_button);
        add(display_book_button);
        add(status);
        add(book_textfield);

        status.setVisible(false);
        setLocationRelativeTo(null);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
 int count = 0;
        if (e.getSource() == add_book_button) {


            tempbook.setTitle(library_textfield.getText().trim());


      mainlibrary.included_new_book(tempbook);

            status.setText("You have submitted a book. Add another?");
            status.setVisible(true);
        } else if (e.getSource()== display_book_button) {

               book_textfield.setText(mainlibrary.nameofbooks());
            }
            book_textfield.setVisible(true);



        }
    }


