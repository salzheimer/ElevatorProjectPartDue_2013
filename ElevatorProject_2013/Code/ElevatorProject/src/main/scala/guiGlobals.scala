import scala.swing._
import event._
import Swing._


object guiGlobals {



	  //Do not change these!
			val elevLocation = new guiElevLocation()
    val door1 = new guiDoor(elevLocation, 1)
    val door2 = new guiDoor(elevLocation, 2)
    val door3 = new guiDoor(elevLocation, 3)
    val motor = new guiElevLocController(elevLocation, door1, door2, door3)
			val guiController = new GuiController


			//Buttons
				val Floor3Action = Action("3")
			{
				guiOutput.elevFloor3()
			}
			val Floor2Action = Action("2")
			{
				guiOutput.elevFloor2()
			}
			val Floor1Action = Action("1")
			{
				guiOutput.elevFloor1()
			}
			val EmergencyAction = Action("Stop")
			{
				guiOutput.elevStop()
			}

			val Floor1Button = new guiElevatorButton(Floor1Action)
			val Floor2Button = new guiElevatorButton(Floor2Action)
			val Floor3Button = new guiElevatorButton(Floor3Action)
			val StopButton = new guiElevatorButton(EmergencyAction)



				     val downAction3 = Action("down")
    					{
    						guiOutput.Floor3Down()
    					}
    					val downButton3 = new guiElevatorButton(downAction3)

    
    					val upAction2 = Action("up")
    					{
    						guiOutput.Floor2Up()
    					}
         	val upButton2 = new guiElevatorButton(upAction2)
    					val downAction2 = Action("down")
    					{
    						guiOutput.Floor2Down()
    					}
   	      val downButton2 = new guiElevatorButton(downAction2)		

         val upAction1 = Action("up")
    					{
    						guiOutput.Floor1Up()
    					}
    					val upButton1 = new guiElevatorButton(upAction1)


    			 val UpArrow = new RadioButton("/\\")
    			 val DownArrow = new RadioButton("\\/")
    				UpArrow.enabled = false
    		  	DownArrow.enabled = false
   	      			
}