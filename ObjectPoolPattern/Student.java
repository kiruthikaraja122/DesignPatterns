package ObjectPoolPattern;

public class Student {

	
	    private int enroll;
	    private String name;
	    private Department department;

	       
	     private static int comDepCount = 0;
	    private static int mecDepCount = 0;
	    private static int eleDepCount = 0;
	    
	    private static Department pool[] = new Department[3];
	    
	    public Student( int enroll,String name, String departmentName)
	    {
	        this.name = name;
	        this.enroll = enroll;
	        department = initDepartment(departmentName);
	        
	    }
	    
	    public Department initDepartment(String name)
	    {
	        
	        if(name =="ComputerScience")
	        {
	            if(comDepCount == 0)
	            {
	                pool[0] = new ComputerScience();
	                comDepCount++;
	                return pool[0];
	            }
	            else
	            {
	                comDepCount++;
	                
	                return pool[0];    
	            }
	            
	        }
	        else
	        {
	            if(name == "Electrical")
	            {
	                if(eleDepCount == 0)
	                {
	                    pool[1] = new Electrical();
	                        eleDepCount++;
	                        
	                    return pool[1];
	                }
	     else
	                {
	                    eleDepCount++;
	                    return pool[1];
	                }
	            }
	            else
	            {
	                if(mecDepCount == 0)
	                {
	                    pool[2] = new Mechanical();
	                    mecDepCount++;
	                    return pool[2];
	                }
	                else
	                {
	                    mecDepCount++;
	                    return pool[2];
	                }
	            }
	        }
	    }
	    
	    public Department getDepartment()
	    {
	        return department;
	    }
	    
	    public String getName()
	    {
	        return name;
	    }
	    
	    public int getEnroll()
	    {
	        return enroll;
	    }
	    
	   
	    
	    public static void  releaseReference(Student studentToRelease)
	    {
	        if(studentToRelease.department == pool[0])
	        {
	            comDepCount--;
	        }
	        else
	        {
	            if(studentToRelease.department == pool[1])
	            {
	                eleDepCount--;
	            }
	            else
	            {
	                mecDepCount--;
	            }
	        }
	    }
	 
	    
	     public static int getMecDepCount()
	    {
	        return mecDepCount;
	    }
	    
	    public static int getComDepCount()
	    {
	        return comDepCount;
	    }
	    
	    public static int getEleDepCount()
	    {
	        return eleDepCount;
	    }
	    
	    
	}

