package io.github.codeutilities.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;

public interface Command {

    void register(CommandDispatcher<FabricClientCommandSource> cd);

    default LiteralArgumentBuilder<FabricClientCommandSource> literal(String name) {
        return LiteralArgumentBuilder.literal(name);
    }

    default <T> RequiredArgumentBuilder<FabricClientCommandSource, T> argument(String name, ArgumentType<T> type) {
        return RequiredArgumentBuilder.argument(name, type);
    }
}
