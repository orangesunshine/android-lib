package com.orange.androidlib.animation.path;


import com.orange.androidlib.animation.PathPoint;

public abstract class PathBuild {

    public abstract PathPoint evaluate(float t, PathPoint startValue, PathPoint endValue);
}
