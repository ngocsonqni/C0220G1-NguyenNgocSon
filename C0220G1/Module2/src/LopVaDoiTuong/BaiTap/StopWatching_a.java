package LopVaDoiTuong.BaiTap;

public class StopWatching_a {
        private long startTime = System.currentTimeMillis(), endTime;
        public void start() {
            this.startTime = System.currentTimeMillis();
        }
        public void end() {
            this.endTime = System.currentTimeMillis();
        }
        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }

