from PyQt5.QtWidgets import *
from PyQt5.QtGui import *
from QCustomizedWidgets.PasswordEdit import PasswordEdit
import Login.LoginWidget


class RegisterWidget(QWidget):
    def __init__(self, window : QMainWindow):
        super(RegisterWidget, self).__init__()
        layout = QFormLayout()
        self.window = window

        #Labels
        registerLab = QLabel('Register')
        emailLab = QLabel('Email: ')
        userLab = QLabel('Username: ')
        passLab = QLabel('Password: ')
        verPassLab = QLabel('Verify Password: ')
        phoneLab = QLabel('Phone Number: ')

        # Text field inputs.
        self.email = QLineEdit()
        self.username = QLineEdit()
        self.password = PasswordEdit()
        self.verifyPassword = PasswordEdit()
        self.phone = QLineEdit()


        #Buttons
        submitBtn = QPushButton('Submit')
        loginBtn = QPushButton('Login Instead')

        #Add connections.
        loginBtn.clicked.connect(self.loginClicked)
        submitBtn.clicked.connect(self.attemptRegister)

        layout.addRow(registerLab)
        layout.addRow(emailLab, self.email)
        layout.addRow(userLab, self.username)
        layout.addRow(passLab, self.password)
        layout.addRow(verPassLab, self.verifyPassword)
        layout.addRow(phoneLab, self.phone)
        layout.addRow(submitBtn, loginBtn)

        self.setLayout(layout)


    def loginClicked(self):
        widget = Login.LoginWidget.LoginWidget(self.window)
        self.window.setCentralWidget(widget)

    def attemptRegister(self):
        if not(len(self.username.text()) >= 8 and len(self.password.text()) >= 8 and len(self.email.text()) > 5 and len(self.phone.text()) != 10):
            QMessageBox.about(self, 'Insufficient Lengths', 'You have failed to meet the criteria. Usernames and passwords must be 8 characters. Emails must be 6 '
                                 'characters or longer.')

        if not(self.password == self.verifyPassword):
            QMessageBox.about(self, "Passwords don't match", "Passwords do not match. Please change the passwords so they match. ")
        else:
            print('Passwords are equal.')
            #Add some database action here to submit the form.
