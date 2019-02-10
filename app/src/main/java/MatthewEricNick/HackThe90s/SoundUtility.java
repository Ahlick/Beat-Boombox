package MatthewEricNick.HackThe90s;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundUtility {

    private SoundPool soundPool;
    private Context con;

    private int idProjectileShoot;

    SoundUtility(Context con) {
        this.con = con;
        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

        idProjectileShoot = soundPool.load(con, R.raw.projectile_shoot, 1);
    }

    void playProjectileShoot() {
        soundPool.play(idProjectileShoot, 1, 1, 0, 0, 1);
    }
}