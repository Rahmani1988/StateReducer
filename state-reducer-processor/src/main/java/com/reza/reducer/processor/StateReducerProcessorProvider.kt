package com.reza.reducer.processor

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class StateReducerProcessorProvider: SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return StateReducerProcessor(
            codeGenerator = environment.codeGenerator,
            logger = environment.logger
        )
    }
}