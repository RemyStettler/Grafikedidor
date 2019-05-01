import Display.EditorFrame;

public final class GraphicEditor {

    public static void main(String[] args) {
        new GraphicEditor();
    }

    private GraphicEditor() {
        EditorFrame frame = new EditorFrame(800, 600);
    }
}
