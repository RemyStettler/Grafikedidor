package Display;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public final class EditorPanel extends JPanel {
  private EditorControl editorControl;

  EditorPanel(EditorControl control) {
    editorControl = control;
    addMouseListener(new EditorMouseAdapter(this, editorControl));
    addKeyListener(new EditorKeyboardAdapter(editorControl));
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    editorControl.repaintAll(g);
  }
}