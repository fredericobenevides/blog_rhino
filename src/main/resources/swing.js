importPackage(java.awt);
importPackage(javax.swing);

var labelWidth = 136;
var labelHeight = 12;
var labelAX = 1;
var labelAY = 6;

var labelX = 1 + java.lang.Math.random() * 450;
var labelY = 1 + java.lang.Math.random() * 358;

var label = new Label("* Frederico Benevides *");
label.setForeground(Color.YELLOW);
label.setBounds(labelX, labelY, labelWidth, labelHeight);

var panel = new JPanel();
panel.setLayout(null);
panel.setBackground(Color.BLACK);
panel.setSize(600, 400);
panel.add(label);

var frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.add(panel);
frame.setSize(600, 400);
frame.setVisible(true);


threadToRun = { 
	run: function () { 
		while (true) {
			label.setBounds(labelX, labelY, labelWidth, labelHeight);
			
			if (labelX < 1 || labelX >= 450) {
				labelAX = -labelAX;
			}
			if (labelY < 1 || labelY >= 358) {
				labelAY = -labelAY;
			}
			labelX += labelAX;
			labelY += labelAY;
			java.lang.Thread.sleep(100);
		}
	}
}
runnable = new java.lang.Runnable(threadToRun);
t = new java.lang.Thread(runnable);
t.start();

