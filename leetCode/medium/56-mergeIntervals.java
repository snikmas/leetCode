import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // 1️⃣ Сначала сортируем интервалы по начальному числу
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2️⃣ Создаём список для результата
        List<int[]> res = new ArrayList<>();

        // 3️⃣ Берём первый интервал как текущий
        int[] current = intervals[0];
        res.add(current);

        // 4️⃣ Проходим по остальным интервалам
        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = current[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // если есть пересечение
            if (nextStart <= currentEnd) {
                current[1] = Math.max(currentEnd, nextEnd); // объединяем
            } else {
                // если нет — добавляем новый диапазон
                current = intervals[i];
                res.add(current);
            }
        }

        // 5️⃣ Преобразуем ArrayList в массив
        return res.toArray(new int[res.size()][]);
    }
}
// 