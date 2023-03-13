package abstractDesignPattern;


public class AbstractMethodFactory {



	public static void main(String [] args)
	{
		SourceCourseFactory Course = FactoryCreator.getSourceCourseFactory("course");
		
			System.out.println(Course.getCource("non programming").getCourseName());
			
			SourceCourseFactory Source =FactoryCreator.getSourceCourseFactory("Source");
			
			System.out.println(Source.getSource(" online").getSourceName());

		}
	}


