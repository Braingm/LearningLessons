package ru.braingm.runners;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Obstacle {
    protected int obstacleSize;
    protected ObstacleType type;

}
