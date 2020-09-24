View Layer : MainViewController.java - This is class with main method.
Service Layer: FoodService.java, ApparelService.java, ElecService.java - This is the Service Layers of the application.
               FoodCategoryInterface.java, ApparelCategoryInterface.java, ElecCategoryInterface.java - These are the interfaces being implemented by above Service Classes.
Dao Layer: FoodDao.java, ApparelDao.java, ElecDao.java - These are the DAO Layers of the application.
           FoodItems.java, Apparel.java, Electronics.java - These are the seperate classes for saving objects of such classes. 
           FoodDaoInterface.java, ApparelDaoInterface.java, ElecDaoInterface.java - These are the interfaces being implemented by above DAO Classes.
           DuplicateEntryException.java, CategoryNotFound.java - These are the Exception classes incase entries are duplicate or Reports are not found.