package br.com.narutoto.obitounlocked.mixin;

import net.mcreator.narutoto.network.NarutotoModVariables.PlayerVariables;
import net.mcreator.narutoto.procedures.KamuiUserProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.objectweb.asm.Opcodes;

@Mixin(value = KamuiUserProcedure.class, remap = false)
public abstract class KamuiUserMixin {
    @Redirect(method = "execute", at = @At(value = "FIELD",
        target = "Lnet/mcreator/narutoto/network/NarutotoModVariables$PlayerVariables;if_sharigan:D",
        opcode = Opcodes.GETFIELD), require = 0)
    private static double narutotoObitoUnlocked$allowSasukeMangekyo(PlayerVariables vars) {
        return "sasuke".equalsIgnoreCase(vars.mangekyo_owner) ? 2.0D : vars.if_sharigan;
    }
}
