import sys
from PyQt5.QtCore import *
from PyQt5.QtWidgets import *
from Login.LoginWidget import LoginWidget




# Starts off the program.
if __name__ == '__main__':
    app = QApplication(sys.argv)
    window = QMainWindow()
    window.setGeometry(400, 400, 400, 400)
    windowK = LoginWidget(window)
    window.setCentralWidget(windowK)

    window.show()
    sys.exit(app.exec_())