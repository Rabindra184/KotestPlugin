import com.qasecret.automation.rp.util.ReportPortalListener
import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension

class ProjectConfig : AbstractProjectConfig() {
    override fun extensions(): List<Extension> {
        return listOf(ReportPortalListener())
    }
}