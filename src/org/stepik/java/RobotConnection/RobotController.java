package org.stepik.java.RobotConnection;

public class RobotController {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robot = null;
        boolean needToClose = true;
        for (int i=0; i < 3; i++) {
            try {
                robot = robotConnectionManager.getConnection();
                robot.moveRobotTo(toX, toY);
                return;
            }
            catch (RobotConnectionException e) {
                if(i==2){
                    if (robot != null)
                        robot.close();
                    needToClose = false;
                    throw e;
                }
            }
            catch (Exception ex) {
                try{
                    if ((robot != null) && needToClose){
                        robot.close();
                        needToClose = false;
                    }
                }
                catch(Exception exp){
                    //ignore
                }
                throw ex;
            }
            finally {
                try{
                    if ((robot != null) && needToClose)
                        robot.close();
                }
                catch(Exception exp){
                    //ignore
                }

            }
        }
    }
}
