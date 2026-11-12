package br.com.narutoto.obitounlocked.mixin;

import net.mcreator.narutoto.network.NarutotoModVariables.PlayerVariables;
import net.mcreator.narutoto.procedures.KamuiRightClickProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.objectweb.asm.Opcodes;

@Mixin(value = KamuiRightClickProcedure.class, remap = false)
public abstract class KamuiRightClickMixin {
    @Redirect(method = "execute", at = @At(value = "FIELD",
        target = "Lnet/mcreator/narutoto/network/NarutotoModVariables$PlayerVariables;mangekyo_owner:Ljava/lang/String;",
        opcode = Opcodes.GETFIELD), require = 0)
    private static String narutotoObitoUnlocked$shareObitoKamui(PlayerVariables vars) {
        return "sasuke".equalsIgnoreCase(vars.mangekyo_owner) ? "obito" : vars.mangekyo_owner;
    }

    @Redirect(method = "execute", at = @At(value = "FIELD",
        target = "Lnet/mcreator/narutoto/network/NarutotoModVariables$PlayerVariables;if_sharigan:D",
        opcode = Opcodes.GETFIELD), require = 0)
    private static double narutotoObitoUnlocked$allowSasukeMangekyo(PlayerVariables vars) {
        return "sasuke".equalsIgnoreCase(vars.mangekyo_owner) ? 2.0D : vars.if_sharigan;
    }
}
