package com.github.dataanon.strategy.bool

import com.github.dataanon.model.Field
import com.github.dataanon.model.Record
import com.github.dataanon.strategy.AnonymizationStrategy
import com.github.dataanon.utils.RandomSampling

abstract class RandomBoolean<T: Any> (private val values: List<T>) : AnonymizationStrategy<T>, RandomSampling {

    override fun anonymize(field: Field<T>, record: Record): T = sample(values = values)
}