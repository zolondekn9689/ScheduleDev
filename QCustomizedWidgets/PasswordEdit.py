from PyQt5.QtWidgets import *
from PyQt5.QtCore import *
from PyQt5.QtGui import *

class PasswordEdit(QLineEdit):
    def __init__(self):
        super(PasswordEdit, self).__init__()
        self.setEchoMode(QLineEdit.Password)
        self.setPlaceholderText("Password")
        self.setFocus()
        pal = QPalette()
        pal.setColor(QPalette.Base, Qt.red)
        self.setPalette(pal)
        self.setInputMask("")

    #Equivalence method
    def __eq__(self, other : QLineEdit):
        if (other.text() == self.text()):
            return True
        else:
            return False

    def __ne__(self, other : QLineEdit):
        if (other.text() == self.text()):
            return False
        else:
            return True