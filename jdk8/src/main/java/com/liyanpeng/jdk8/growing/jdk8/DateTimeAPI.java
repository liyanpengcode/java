package com.liyanpeng.jdk8.growing.jdk8;

import java.time.*;

public class DateTimeAPI {

    public static void main(String[] args) {
        //获取默认的时区
        final Clock clock = Clock.systemUTC();
        //获取瞬时
        System.out.println(clock.instant());
        //打印毫秒
        System.out.println(clock.millis());
        //Get the lcoal date and lcoal time
        final LocalDate localDate = LocalDate.now();
        //获取当前时区的时间
        final LocalDate dateFromClock = LocalDate.now(clock);
        System.err.println(localDate);
        System.err.println(dateFromClock);

        //Get the local time and lcoal time
        final LocalTime localTime = LocalTime.now();
        final LocalTime time = LocalTime.now(clock);
        System.out.println(localTime);
        System.out.println(time);
        //Get the localdatetime and localdatetime
        final LocalDateTime localDateTime = LocalDateTime.now();
        final LocalDateTime localDateTime1 = LocalDateTime.now(clock);
        System.err.println(localDateTime);
        System.err.println(localDateTime1);

        //Get the zoned date/time
        final ZonedDateTime zonedDateTime = ZonedDateTime.now();
        final ZonedDateTime zonedDateFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zonedDateTimeFromZone = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateFromClock);
        System.out.println(zonedDateTimeFromZone);


        final LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);
        final LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);
        //Duration持续时间
        Duration duration = Duration.between(from, to);

        System.out.println("Duration in days:" + duration.toDays());

        System.out.println("Duration in hours:" + duration.toHours());

    }
}
