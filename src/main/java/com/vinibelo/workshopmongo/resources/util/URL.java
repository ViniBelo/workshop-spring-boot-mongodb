package com.vinibelo.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public class URL {
    public static String decodeParam(String text) {
        return URLDecoder.decode(text, StandardCharsets.UTF_8);
    }

    public static LocalDate convertDate(String textDate) {
        if (!Objects.equals(textDate, "")) {
            return LocalDate.parse(textDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } else {
            return LocalDate.parse("1970-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
    }
}
