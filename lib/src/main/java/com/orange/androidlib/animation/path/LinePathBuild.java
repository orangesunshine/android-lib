package com.orange.androidlib.animation.path;


import com.orange.androidlib.animation.PathPoint;

public class LinePathBuild extends PathBuild {
    @Override
    public PathPoint evaluate(float t, PathPoint startValue, PathPoint endValue) {
        float x = 0, y = 0;
        x = startValue.mX + t * (endValue.mX - startValue.mX);
        y = startValue.mY + t * (endValue.mY - startValue.mY);
        return new PathPoint(x, y);
    }
}
