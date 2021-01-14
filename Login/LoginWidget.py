
from PyQt5.QtWidgets import *
from QCustomizedWidgets.PasswordEdit import PasswordEdit
from Login.RegisterWidget import RegisterWidget
class LoginWidget (QWidget):
    # This initializes before the main constructor.
    def __init__(self, window : QMainWindow):
        super(LoginWidget, self).__init__()
        layout = QFormLayout()
        self.window = window

        #Initialize the widgets.
        text1 = QLabel('Username: ')
        text2 = QLabel('Password: ')
        user = QLineEdit()
        user.setMaximumWidth(150)
        password = PasswordEdit()
        password.setEchoMode(QLineEdit.Password)
        submitBtn = QPushButton('Submit')
        registerBtn = QPushButton('Register')


        #Set clicked events

        registerBtn.clicked.connect(self.registerClicked)



        # Put widgets into rows.
        layout.addRow(text1, user)
        layout.addRow(text2, password)
        layout.addRow(submitBtn)
        layout.addRow(registerBtn)


        # Setting layout on parent.
        self.setLayout(layout)



    def registerClicked(self):
        widget = RegisterWidget(self.window)
        self.window.setCentralWidget(widget)



