package prog24178;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;



public class LibraryDatabase extends JFrame implements ActionListener{
	JTextField txtSearchBy;
	JLabel lblSearchBy;
	JComboBox<String> comboSearchBy;
	JButton btnAddBook, btnModifyBook, btnListAll;
	JTextArea textAreaList;
	public LibraryDatabase() {
		setTitle("Library Database");
		getContentPane().setLayout(null);
		
		JLabel lblSearchBy = new JLabel("Search By: ");
		lblSearchBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchBy.setBounds(10, 11, 89, 14);
		getContentPane().add(lblSearchBy);
		
		JComboBox comboSearchBy = new JComboBox();
		comboSearchBy.setBounds(124, 10, 150, 20);
		getContentPane().add(comboSearchBy);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSearch.setBounds(10, 67, 264, 23);
		getContentPane().add(btnSearch);
		
		JTextField txtSearchBy = new JTextField();
		txtSearchBy.setText("Enter Search Value Here:");
		txtSearchBy.setBounds(10, 36, 264, 20);
		getContentPane().add(txtSearchBy);
		txtSearchBy.setColumns(10);
		
		JTextArea textAreaList = new JTextArea();
		textAreaList.setFont(new Font("Monospaced", Font.PLAIN, 10));
		textAreaList.setBounds(0, 101, 284, 215);
		getContentPane().add(textAreaList);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnAddBook.setBounds(10, 327, 86, 23);
		getContentPane().add(btnAddBook);
		
		JButton btnModifyBook = new JButton("Modify");
		btnModifyBook.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnModifyBook.setBounds(94, 327, 94, 23);
		getContentPane().add(btnModifyBook);
		
		JButton btnListAll = new JButton("List ");
		btnListAll.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnListAll.setBounds(185, 327, 89, 23);
		getContentPane().add(btnListAll);
		
	}

	public static void main(String[] args) {
		LibraryDatabase app = new LibraryDatabase();
		app.setSize(300,400);
		app.setVisible(true);
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}


	public void actionPerformed(ActionEvent e) {
		
	}
}
