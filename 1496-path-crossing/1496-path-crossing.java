

import java.awt.Point;
class Solution {
    /** Algorithm:
        1. Use a set of java.awt.Point to keep track of visited points.
        2. With each visited point, add it to set & if exists in set, then return true.
        3. Return false.
     */
    public boolean isPathCrossing(String path) {
        Set<Point> visited = new HashSet<>();
        Point currentLoc = new Point(0,0);
        visited.add(currentLoc);
        for(char c : path.toCharArray()) {
            currentLoc = getPoint(c, currentLoc.x, currentLoc.y);
            if(!visited.add(currentLoc)) {
                return true;
            }
        }
        return false;
    }

    private Point getPoint(char c, int currX, int currY) {
        switch(c) {
            case 'N': return new Point(currX, currY +1);
            case 'S': return new Point(currX, currY -1);
            case 'E': return new Point(currX +1, currY);
            default:  return new Point(currX -1, currY);
        }
    }
}