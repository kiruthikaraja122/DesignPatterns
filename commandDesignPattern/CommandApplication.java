package commandDesignPattern;

public class CommandApplication {
	public static void main(String[] args) {
		TextFileOperationExecutor textFileOperationExecutor
				= new TextFileOperationExecutor();
		textFileOperationExecutor.executeOperation(
				new OpenTextFileOperation(new TextFile("file1.txt")));
		textFileOperationExecutor.executeOperation(
				new SaveTextFileOperation(new TextFile("file2.txt")));
	}

}
