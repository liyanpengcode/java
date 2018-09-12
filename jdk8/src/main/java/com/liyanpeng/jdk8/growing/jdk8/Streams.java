package com.liyanpeng.jdk8.growing.jdk8;

import java.util.Arrays;
import java.util.Collection;

/**
 * 流
 */
public class Streams {
    private enum Status {
        OPEN, CLOSED
    }

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }

        @Override
        public String toString() {

            return String.format("[%s,%d]", status, points);
        }


    }

    public static void main(String[] args) {

        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 10),
                new Task(Status.CLOSED, 15),
                new Task(Status.OPEN, 20)
        );

        final long totalPointsOfOpenTasks = tasks.stream()
                .filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(Task::getPoints)
                .sum();
        System.err.println(totalPointsOfOpenTasks);
    }


}
