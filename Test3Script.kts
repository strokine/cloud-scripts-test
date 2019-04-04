import java.util.function.Function
import com.comcast.xbo.wpil.device.Device

class Test3Script : Function<Device, Device>(){

    override fun apply(t: Device): Device {
        println("Hello there SCRIPT $t")
        t.name = t.name!!.toUpperCase()
        return t
    }
}

Test3Script()
