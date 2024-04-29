package jdbc;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employees";
        String userName = "root";
        String password = "jiyun9163!";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM departments");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        // 열 너비를 계산하기 위해 각 열의 최대 길이를 저장하는 배열
        int[] columnWidths = new int[columnCount];

        // 각 열의 최대 길이 계산
        for (int i = 1; i <= columnCount; i++) {
            columnWidths[i - 1] = metaData.getColumnLabel(i).length(); // 컬럼명의 길이로 초기화

            // 각 행의 데이터를 탐색하면서 최대 길이를 업데이트
            resultSet.beforeFirst(); // 결과셋을 첫 행으로 되돌림
            while (resultSet.next()) {
                String value = resultSet.getString(i);
                if (value != null && value.length() > columnWidths[i - 1]) {
                    columnWidths[i - 1] = value.length();
                }
            }
        }

        // 헤더 출력
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnLabel(i);
            System.out.print(padRight(columnName, columnWidths[i - 1] + 2));
        }
        System.out.println();

        // 구분선 출력
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(padRight("", columnWidths[i - 1] + 2, '-'));
        }
        System.out.println();

        // 데이터 출력
        resultSet.beforeFirst(); // 결과셋을 첫 행으로 되돌림
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                String value = resultSet.getString(i);
                System.out.print(padRight(value, columnWidths[i - 1] + 2));
            }
            System.out.println();
        }

        resultSet.close();
        statement.close();
        connection.close();
    }

    // 문자열을 주어진 길이로 오른쪽으로 정렬하고, 필요한 만큼 공백을 채워 반환
    private static String padRight(String s, int length) {
        return padRight(s, length, ' ');
    }

    // 문자열을 주어진 길이로 오른쪽으로 정렬하고, 필요한 만큼 지정된 문자로 채워 반환
    private static String padRight(String s, int length, char padChar) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < length) {
            sb.append(padChar);
        }
        return sb.toString();
    }
}
